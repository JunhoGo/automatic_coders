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
         outToServer.println("�ȳ� �� �ڿ�����");//�������� ����!
         System.out.println("�ȳ� �� �ڿ�����");
         //1.���� ���� ��� ���� �ִ��� 
         //person�� current�� �־�
         location current_location = new location();
         int hi = current_location.find_current_station(1);
         System.out.println(hi);//���� ���� ��
         client_infromation.setCurrentStation(hi);//���� ���� current�� ������
         System.out.println(client_infromation.getCurrentStation());//person�� �� ������ Ȯ��
         //������ Ŭ���ϴ� â�� ����!! 
         //2. �������� person�� �־�
         ConvertToString convert = new ConvertToString();
         String current = convert.toString(client_infromation.getCurrentStation());
         Enter_destination_station enter_dest = new Enter_destination_station(current);// ������ ���� �� ��
         //enter_dest.setVisible(true);
        // enter_dest.setVisible(true);
         int dest = 0;
        //client_infromation.setDestinationStation(dest);//Ŭ���̾�Ʈ�� ��� dest�� �� ������ ������ �޾�
       
        while(true)
        {
        	dest = enter_dest.getDesination();
           if(dest!=0){
        	  System.out.println("����~~~~~~~"+dest);
              break;
              }
        }
        client_infromation.setDestinationStation(dest);//Ŭ���̾�Ʈ�� ��� dest�� �� ������ ������ �޾�
         System.out.println("���� ���� dest�� : "+dest);
         //3.��� ����Ʈ �޾�
         //�ڸ� GUI�� �����
         //�������� ������!!
         give_all_seat(outToServer,inFromUser);
         
         
         //4. while�� ���� ����!
         
         Go_to_destination during_going_dest = new Go_to_destination();
         if(during_going_dest.go_to_destination(client_infromation.getDeststation()) == -1){//while���� ��� ����
            //����� �����մϴ� ������
            Go_to_destination_station soon = new Go_to_destination_station();
            //�� �����մϴ�.
         }
         
         //�� seat���� ������!!
        // remove!!!
         get_out_of_seat(outToServer);
       //  ???????????�߰��ؾ���
         
         //destination�̶� ������ �����߽��ϴ�. ������!!
         Finish_arrive FINISH = new Finish_arrive();
         //������! 
         subwaydoor door = new subwaydoor();
         //�̰� ���� �ϸ� ��!!!
         c_socket.close();
      }catch(IOException e){
         e.printStackTrace();
      } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   }

//�̰� �־�� �� 
   public synchronized static void give_all_seat(PrintWriter outToServer,BufferedReader inFromUser) throws IOException{
   
     int i=0;
     int seat = 0;
     System.out.println("����� give_all_seat! �Դϴ�");
    System.out.println(client_infromation.getPersonSeat());//�������� ����!
    System.out.println(client_infromation.getDeststation());//�������� ����!
    System.out.println(client_infromation.getCurrentStation());//�������� ����!
    System.out.println("seat "+client_infromation.getPersonSeat());

     outToServer.println(client_infromation.getPersonSeat());//�������� ����!
      outToServer.println(client_infromation.getDeststation());//�������� ����!
      outToServer.println(client_infromation.getCurrentStation());//�������� ����!
   
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
      	  System.out.println("����~~~~~~~"+finish);
            break;
            }
      }
   }
   
   public synchronized static void get_out_of_seat(PrintWriter outToServer){
      
         outToServer.println(client_infromation.getPersonSeat());//�������� ����!
        
      //���� ������!!! ��� ���� ~~~~~~~~~~~<���� ����!>
      }
}

//�Ⱥ��� ��


//String modifiedSentence = inFromUser.readLine();//�������׼� �� ��(���� �ð�)
//System.out.print(modifiedSentence+"\n");
//���� �غ��� ����
//String another_modifiedSentence = inFromUser.readLine();//�������׼� �� ��(Enter your destination station:)
//System.out.print(another_modifiedSentence+"\n");
/* read a expression from user. */
//String expression = scan.next();
/* Send line to server */
//outToServer.println(expression + '\n');//�������� ����!
//outToServer.flush();
//���� ��õ�� ��� ������ ��! 

/* Read line from server */
//modifiedSentence = inFromServer.readLine();
//System.out.println("����� client !!! ->" + modifiedSentence);
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