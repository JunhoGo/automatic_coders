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
public class TCP_echo_client {
   
   static Person client_infromation = new Person();

   public static void main(String[] args) throws IOException {
      try{
         //Person client_infromation = new Person();
         /* Create client socket, connect to server */
        // Socket c_socket = new Socket("172.16.19.218",6789);
    	      Socket c_socket = new Socket("127.0.0.1",6789);

         Scanner scan = new Scanner(System.in);
         /* Create output stream attached to socket */
         /* Create input stream attached to socket */
         BufferedReader inFromUser ;
         PrintWriter outToServer;
         inFromUser = new BufferedReader(new InputStreamReader(
               c_socket.getInputStream()));
         outToServer = new PrintWriter(c_socket.getOutputStream(), true);
         //System.out.println(inFromUser.readLine());
         outToServer.println("안녕 난 박예지얌");//서버에게 보냄!
         //1.내가 현재 어디 역에 있는지 
         //person에 current를 넣어
         int hi = 0;
         do{
         location current_location = new location();
         hi = current_location.find_current_station(1);
         System.out.println("현재 나의 역 정보 입니닷 1 "+hi);//현재 나의 역
         client_infromation.setCurrentStation(hi);//현재 나의 current를 가져와
         System.out.println("현재 나의 역 정보 입니닷 2 "+client_infromation.getCurrentStation());//person에 잘 들어갔는지 확인
         
         
         }while(hi==9);
         int dest = 0;
        
           //목적지 클릭하는 창이 떠요!! 
            //2. 목적지를 person에 넣어
            ConvertToString convert = new ConvertToString();
            String current = convert.toString(client_infromation.getCurrentStation());
            do{
            Enter_destination_station enter_dest = new Enter_destination_station(current);// 목적지 찍을 수 있게
          
           while(true){
              dest = enter_dest.getDesination();//목적지를 찍어서 가져왓
              if(dest!=0){
                 System.out.println("오예~목적지를 찾았습니닷 "+dest);
                 break;
             }
              //enter_dest.setVisible(false);
           }
           if(dest>hi){
              System.out.println("gh");
               break;
           }
           else{
           Wrong_information wrong = new Wrong_information(); // 목적지가 현재보다 작으면 이상하니까 다시 돌아 !! 
           DealyMethod(10);
           }
           
        } while(true);

         
      
        client_infromation.setDestinationStation(dest);//클라이언트가 어디 dest로 갈 것인지 정보를 받아
         System.out.println("나의  dest는 : "+dest);
         //3.어레이 리스트 받아
         //자리 GUI도 띄워줘
         //서버한테 연락햇!!
         give_all_seat(outToServer,inFromUser);
         
         
         //4. while문 돌기 시작!
         System.out.println("바로 저의 최종 자리는 요??? "+client_infromation.getPersonSeat());
         Go_to_destination during_going_dest = new Go_to_destination();
         if(during_going_dest.go_to_destination(client_infromation.getCurrentStation(),client_infromation.getDeststation()) == -1){
         //while문을 계속 돌아
             Go_to_destination_station soon = new Go_to_destination_station();
         
            //잠시후 도착합니다 보여줘
           // soon.setVisible(true);
            //곧 도착합니다.
       
         
         //그 seat에서 빼내기!!
        // remove!!!
         get_out_of_seat(outToServer);
       //  ???????????추가해야햇
        if(client_infromation.getDeststation()>8){
        	DealyMethod(230);
        }
        else
        	DealyMethod(110);

         
         //문열림! 
         subwaydoor door = new subwaydoor();
       //destination이랑 같으면 도착했습니다. 보여줘!!
         DealyMethod(6);
        // door.setVisible(false);
         Finish_arrive FINISH = new Finish_arrive(client_infromation.getDeststation());
         }
         else{
            System.out.println("오류오류~");
         }
         //이것 까지 하면 끝!!!
         c_socket.close();
      }catch(IOException e){
         e.printStackTrace();
      } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }

   }

//이걸 넣어야 해 
   public synchronized static void give_all_seat(PrintWriter outToServer,BufferedReader inFromUser) throws IOException{
   
     int i=0;
     int seat = 0;
     System.out.println("여기는 give_all_seat! 입니닷");
    System.out.println(client_infromation.getPersonSeat());//서버에게 보냄!
    System.out.println(client_infromation.getDeststation());//서버에게 보냄!
    System.out.println(client_infromation.getCurrentStation());//서버에게 보냄!
    System.out.println("seat "+client_infromation.getPersonSeat());

     outToServer.println(client_infromation.getPersonSeat());//서버에게 보냄!
      outToServer.println(client_infromation.getDeststation());//서버에게 보냄!
      outToServer.println(client_infromation.getCurrentStation());//서버에게 보냄!
   
      ArrayList<Integer> current_all_seat = new ArrayList<Integer>();
      for(i=0;i<=7;i++){
         seat =Integer.parseInt(inFromUser.readLine()); //inFromUser.read();//Integer.parseInt(in.readLine());
         System.out.println(seat+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!클라이언트로 넘어온 수들!!!");
         current_all_seat.add(i,seat);
      }
      //자리를 보여쥼
      //서버한테 하나 받아 최종 싯!!
      int here = Integer.parseInt(inFromUser.readLine()); 
      client_infromation.setPersonSeat(here);
      Show_seat all_seat = new Show_seat();
      all_seat.show_seat(current_all_seat,client_infromation.getPersonSeat()); //현재 받아온 정보의 seat을 보여줌
      current_all_seat.clear();//all_seat.setVisible(false);

      
      //뭔가가 눌리기라도 하면 바로 넘어가~ 그냥 자리 뚕똥뚕 있는 거 나옴!
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
   
   public synchronized static void get_out_of_seat(PrintWriter outToServer){
      
         outToServer.println(client_infromation.getPersonSeat());//서버에게 보냄!
        
      //나를 없애줘!!! 라고 보내 ~~~~~~~~~~~<아직 안함!>
      }
   public static void DealyMethod(int delayTime) throws Exception{
         int mdelayTime;
         mdelayTime = delayTime * 100;
         Robot robot = new Robot();
         robot.delay(mdelayTime);
      }
}

//안봐도 돼


//String modifiedSentence = inFromUser.readLine();//서버한테서 온 것(현재 시간)
//System.out.print(modifiedSentence+"\n");
//여기 밑부터 에러
//String another_modifiedSentence = inFromUser.readLine();//서버한테서 온 것(Enter your destination station:)
//System.out.print(another_modifiedSentence+"\n");
/* read a expression from user. */
//String expression = scan.next();
/* Send line to server */
//outToServer.println(expression + '\n');//서버에게 보냄!
//outToServer.flush();
//밑은 가천대 라고 나오는 것! 

/* Read line from server */
//modifiedSentence = inFromServer.readLine();
//System.out.println("여기는 client !!! ->" + modifiedSentence);
/* If client receives "finish" then close socket. 
if (modifiedSentence.equalsIgnoreCase("FINISH")) {
   System.out.println(modifiedSentence);
   clientSocket.close();
   System.exit(1);
}
/*
 * If client receives "Error" then print the modifiedSentence with
 * error message.
 
else if (s[0].equalsIgnoreCase("Error")) {
   System.out.println(modifiedSentence);
}

 * If client give a correct compute information then print the
 * modifiedSentence with result.
 
else
   System.out.println("Answer: " + modifiedSentence);
*/