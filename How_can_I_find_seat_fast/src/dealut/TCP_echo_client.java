package dealut;
import java.net.*;

import java.awt.Robot;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.net.Socket;
import java.net.ServerSocket;

import java.io.*;
import java.util.*;

//CLIENT
public class TCP_echo_client {
   
	//make person's information case
   static Person client_infromation = new Person();

   public static void main(String[] args) throws IOException {
      try{
         /* Create client socket, connect to server */
        // Socket c_socket = new Socket("172.16.19.218",6789); 범수 IP
    	 Socket c_socket = new Socket("127.0.0.1",6789);

         Scanner scan = new Scanner(System.in);
         /* Create output stream attached to socket */
         BufferedReader inFromUser ;
         /* Create input stream attached to socket */
         PrintWriter outToServer;
         inFromUser = new BufferedReader(new InputStreamReader(
               c_socket.getInputStream()));
         outToServer = new PrintWriter(c_socket.getOutputStream(), true);
         //Send to server
         outToServer.println("안녕 ");
         //1.내가 현재 어디 역에 있는지 
         //Where am I
         //In person, put in current information
         int hi = 0;
         do{
         location current_location = new location();
         hi = current_location.find_current_station(1);
         //Current my station 
         System.out.println("현재 나의 역 정보  1 "+hi);
         client_infromation.setCurrentStation(hi);
         //Current time, my current
         //Confirm current information is good in to person
         System.out.println("현재 나의 역 정보  2 "+client_infromation.getCurrentStation());
         
         }while(hi==9);
         
         int dest = 0;
        
            //목적지 클릭하는 창이 떠요!! 
            //2. 목적지를 person에 넣어
            //Enter the destination in to person
            ConvertToString convert = new ConvertToString();
            String current = convert.toString(client_infromation.getCurrentStation());
            do{
            //You can pick the destination
            Enter_destination_station enter_dest = new Enter_destination_station(current);
          
           while(true){
        	   //Bring the destination 
              dest = enter_dest.getDesination();
              if(dest!=0){
                 break;
             }
           }
           if(dest>hi){
               break;
           }
           else{
           //If destination is smaller than current then go to do-while loop
           Wrong_information wrong = new Wrong_information(); 
           //Call a dealyMethod
           DealyMethod(10);
           }
           
        } while(true);

         
         //Receive information of client destination 
        client_infromation.setDestinationStation(dest);
         System.out.println("나의  dest는 : "+dest);
         
         //3.어레이 리스트 받아
         //자리 GUI도 띄워줘 서버와 연결
         //Receive arrayList and connect to server
         give_all_seat(outToServer,inFromUser);
         
         
         //4. while문 돌기 시작!
         //Start to while loop
         System.out.println("바로 저의 최종 자리는 요??? "+client_infromation.getPersonSeat());
         Go_to_destination during_going_dest = new Go_to_destination();
         if(during_going_dest.go_to_destination(client_infromation.getCurrentStation(),client_infromation.getDeststation()) == -1){
         
        	 //until recycle while loop            
        	 //Show "This subway arrive soon"
             Go_to_destination_station soon = new Go_to_destination_station();
                
         
         //Remove seat
         get_out_of_seat(outToServer);

         if(client_infromation.getDeststation()>8){
        	DealyMethod(230);
        }
        else
        	DealyMethod(110);

         
         //Open the door
         subwaydoor door = new subwaydoor();
         //If it is same time for destination then show "Arrive"
         //DealyMethod
         DealyMethod(6);
         Finish_arrive FINISH = new Finish_arrive(client_infromation.getDeststation());
         }
         else{
            System.out.println("오류오류~");
         }
         //Socket close
         c_socket.close();
      }catch(IOException e){
         e.printStackTrace();
      } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }

   }

   //Call the server , receive to server 
   public synchronized static void give_all_seat(PrintWriter outToServer,BufferedReader inFromUser) throws IOException{
   
     int i=0;
     int seat = 0;
     System.out.println("여기는 give_all_seat! ");
    System.out.println(client_infromation.getPersonSeat());//서버에게 보냄!
    System.out.println(client_infromation.getDeststation());//서버에게 보냄!
    System.out.println(client_infromation.getCurrentStation());//서버에게 보냄!
    System.out.println("seat "+client_infromation.getPersonSeat());

     outToServer.println(client_infromation.getPersonSeat());//서버에게 보냄!
      outToServer.println(client_infromation.getDeststation());//서버에게 보냄!
      outToServer.println(client_infromation.getCurrentStation());//서버에게 보냄!
   
      ArrayList<Integer> current_all_seat = new ArrayList<Integer>();
      for(i=0;i<=7;i++){
         seat =Integer.parseInt(inFromUser.readLine()); 
         System.out.println(seat+"클라이언트로 넘어온 수들!!!");
         current_all_seat.add(i,seat);
      }
      //Show the seat
      //Receive from server
      int here = Integer.parseInt(inFromUser.readLine()); 
      client_infromation.setPersonSeat(here);
      Show_seat all_seat = new Show_seat();
      
      //Current seat information received from server
      all_seat.show_seat(current_all_seat,client_infromation.getPersonSeat()); 
      current_all_seat.clear();

      
      //Show seat
      int finish = 0;
      while(true)
      {
         finish = all_seat.getDesination();
         if(finish==1){
           System.out.println("오예~~~~~~~"+finish);
          break;
         }
      }
      
      
   }
   //Finish - remove 
   public synchronized static void get_out_of_seat(PrintWriter outToServer){
      
         outToServer.println(client_infromation.getPersonSeat());//서버에게 보냄!
   }
   //DealyMethod
   public static void DealyMethod(int delayTime) throws Exception{
         int mdelayTime;
         mdelayTime = delayTime * 100;
         Robot robot = new Robot();
         robot.delay(mdelayTime);
      }
}

