import java.net.*;
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
         System.out.println("안녕 난 박예지얌");
         //1.내가 현재 어디 역에 있는지 
         //person에 current를 넣어
         location current_location = new location();
         int hi = current_location.find_current_station(1);
         System.out.println(hi);//현재 나의 역
         client_infromation.setCurrentStation(hi);//현재 나의 current를 가져와
         System.out.println(client_infromation.getCurrentStation());//person에 잘 들어갔는지 확인
         //목적지 클릭하는 창이 떠요!! 
         //2. 목적지를 person에 넣어
         ConvertToString convert = new ConvertToString();
         String current = convert.toString(client_infromation.getCurrentStation());
         Enter_destination_station enter_dest = new Enter_destination_station(current);// 목적지 찍을 수 있
         //enter_dest.setVisible(true);
        // enter_dest.setVisible(true);
         int dest = 0;
        //client_infromation.setDestinationStation(dest);//클라이언트가 어디 dest로 갈 것인지 정보를 받아
       
        while(true)
        {
        	dest = enter_dest.getDesination();
           if(dest!=0){
        	  System.out.println("오예~~~~~~~"+dest);
              break;
              }
        }
        client_infromation.setDestinationStation(dest);//클라이언트가 어디 dest로 갈 것인지 정보를 받아
         System.out.println("내가 받은 dest는 : "+dest);
         //3.어레이 리스트 받아
         //자리 GUI도 띄워줘
         //서버한테 연락햇!!
         give_all_seat(outToServer,inFromUser);
         
         
         //4. while문 돌기 시작!
         
         Go_to_destination during_going_dest = new Go_to_destination();
         if(during_going_dest.go_to_destination(client_infromation.getDeststation()) == -1){//while문을 계속 돌아
            //잠시후 도착합니다 보여줘
            Go_to_destination_station soon = new Go_to_destination_station();
            //곧 도착합니다.
         }
         
         //그 seat에서 빼내기!!
        // remove!!!
         get_out_of_seat(outToServer);
       //  ???????????추가해야햇
         
         //destination이랑 같으면 도착했습니다. 보여줘!!
         Finish_arrive FINISH = new Finish_arrive();
         //문열림! 
         subwaydoor door = new subwaydoor();
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
      for(i=0;i<=8;i++){
         seat = inFromUser.read();
         current_all_seat.add(i,seat);
      }
      Show_seat all_seat = new Show_seat();
      all_seat.show_seat(current_all_seat);
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