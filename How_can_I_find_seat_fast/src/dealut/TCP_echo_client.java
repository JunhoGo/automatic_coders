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
       //  Socket c_socket = new Socket("172.16.17.203",6789);
    	      Socket c_socket = new Socket("127.0.0.1",6789);
    	  
        //Socket c_socket = new Socket("121.190.2.21",6789);

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
         //1.���� ���� ��� ���� �ִ��� 
         //person�� current�� �־�
         int hi = 0;
         do{
         location current_location = new location();
         hi = current_location.find_current_station(1);
         System.out.println("���� ���� �� ���� �Դϴ� 1 "+hi);//���� ���� ��
         client_infromation.setCurrentStation(hi);//���� ���� current�� ������
         System.out.println("���� ���� �� ���� �Դϴ� 2 "+client_infromation.getCurrentStation());//person�� �� ������ Ȯ��
         
         
         }while(hi==9);
         int dest = 0;
        
           //������ Ŭ���ϴ� â�� ����!! 
            //2. �������� person�� �־�
            ConvertToString convert = new ConvertToString();
            String current = convert.toString(client_infromation.getCurrentStation());
            do{
            Enter_destination_station enter_dest = new Enter_destination_station(current);// ������ ���� �� �ְ�
          
           while(true){
              dest = enter_dest.getDesination();//�������� �� ������
              if(dest!=0){
                 System.out.println("����~�������� ã�ҽ��ϴ� "+dest);
                 break;
             }
              //enter_dest.setVisible(false);
           }
           if(dest>hi){
              System.out.println("gh");
               break;
           }
           else{
           Wrong_information wrong = new Wrong_information(); // �������� ���纸�� ������ �̻��ϴϱ� �ٽ� ���� !! 
           DealyMethod(10);
           }
           
        } while(true);

         
      
        client_infromation.setDestinationStation(dest);//Ŭ���̾�Ʈ�� ��� dest�� �� ������ ������ �޾�
         System.out.println("����  dest�� : "+dest);
         //3.��� ����Ʈ �޾�
         //�ڸ� GUI�� �����
         //�������� ������!!
         give_all_seat(outToServer,inFromUser);
         
         
         //4. while�� ���� ����!
         System.out.println("�ٷ� ���� ���� �ڸ��� ��??? "+client_infromation.getPersonSeat());
         Go_to_destination during_going_dest = new Go_to_destination();
         if(during_going_dest.go_to_destination(client_infromation.getCurrentStation(),client_infromation.getDeststation()) == -1){
         //while���� ��� ����
             Go_to_destination_station soon = new Go_to_destination_station();
         
            //����� �����մϴ� ������
           // soon.setVisible(true);
            //�� �����մϴ�.
       
         
         //�� seat���� ������!!
        // remove!!!
         get_out_of_seat(outToServer);
       //  ???????????�߰��ؾ���
        if(client_infromation.getDeststation()>8){
        	DealyMethod(230);
        }
        else
        	DealyMethod(110);

         
         //������! 
         subwaydoor door = new subwaydoor();
       //destination�̶� ������ �����߽��ϴ�. ������!!
         DealyMethod(6);
        // door.setVisible(false);
         Finish_arrive FINISH = new Finish_arrive(client_infromation.getDeststation());
         }
         else{
            System.out.println("��������~");
         }
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
      for(i=0;i<=7;i++){
         seat =Integer.parseInt(inFromUser.readLine()); //inFromUser.read();//Integer.parseInt(in.readLine());
         System.out.println(seat+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Ŭ���̾�Ʈ�� �Ѿ�� ����!!!");
         current_all_seat.add(i,seat);
      }
      //�ڸ��� ������
      //�������� �ϳ� �޾� ���� ��!!
      int here = Integer.parseInt(inFromUser.readLine()); 
      client_infromation.setPersonSeat(here);
      Show_seat all_seat = new Show_seat();
      all_seat.show_seat(current_all_seat,client_infromation.getPersonSeat()); //���� �޾ƿ� ������ seat�� ������
      current_all_seat.clear();//all_seat.setVisible(false);

      
      //������ ������� �ϸ� �ٷ� �Ѿ~ �׳� �ڸ� �ضˌ� �ִ� �� ����!
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
   public static void DealyMethod(int delayTime) throws Exception{
         int mdelayTime;
         mdelayTime = delayTime * 100;
         Robot robot = new Robot();
         robot.delay(mdelayTime);
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