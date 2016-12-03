import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.net.Socket;
import java.net.ServerSocket;
//import java.io.IOException;
class Echo_protocol implements Runnable{
   static public final int BUFSIZE = 32 ; //Size (in bytes) of I/O buffer
   
   private Socket clntSock; //Connection socket
   private Logger logger; //Logging facility
   private PrintWriter out;
   private BufferedReader in;
  
   public Echo_protocol(Socket clntSock, Logger logger){
      this.clntSock = clntSock;
      this.logger = logger;
   }
  
   public void run(){//run!!!! 
	   try {
		in = new BufferedReader(new InputStreamReader(
				   clntSock.getInputStream()));
		 out = new PrintWriter(clntSock.getOutputStream(), true);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
      ArrayList entry = new ArrayList();
      entry.add("Client address and port = "+clntSock.getInetAddress().getHostAddress()+":"+clntSock.getPort());
      entry.add("Thread = "+Thread.currentThread().getName());
      Get_current_time_exam currentTime = new Get_current_time_exam();//Time �޴� �κ�
      String currentTimeStr = currentTime.GetCurrentTimeExam();
      entry.add("current time is "+currentTimeStr);//��������� �� �� !!! 
 
         System.out.println("hi ���� ����?");
         //Get the input and output I/O streams from socket
         try {
 			System.out.println("Hello!ȣȣ");
 			 String str= in.readLine();
 			 System.out.println("�Ұ�"+str);
 			 
            ArrayList<Integer> current_all_seat = new ArrayList<Integer>();
            
            int seat = Integer.parseInt(in.readLine()) ;
            System.out.println("seat "+seat);

            int destination = Integer.parseInt(in.readLine());
            int current = Integer.parseInt(in.readLine()) ;
            System.out.println("seat "+seat);
            System.out.println("dest "+destination);
            System.out.println("curr "+current);
            Find_all_information find_all = new Find_all_information();
            current_all_seat = find_all.get_current_seat(1);
            //8�� ���� ������!
			

			
            out.println(current_all_seat.get(0));
            out.println(current_all_seat.get(1));
            out.println(current_all_seat.get(2));
            out.println(current_all_seat.get(3));
            out.println(current_all_seat.get(4));
            out.println(current_all_seat.get(5));
            out.println(current_all_seat.get(6));
            out.println(current_all_seat.get(7));
            out.println(current_all_seat.get(8));

            //�����ڸ��� ������ 
          
            int here = find_all.get_fast_seat(current);
            //���� ���� ���� ã��
            
            find_all.Queue(here, current, destination, true);
            //�־���.
            
            
            //�����
            
            
            int one_more_seat = in.read();
            find_all.Queue(one_more_seat, 0, 0, false);

            //Ŭ���̾�Ʈ
	      
          //  out.println(current_all_seat);
         }catch (IOException e){
             entry.add("Exception =" + e.getMessage());//����
         }
      try{//close socket
      ///   System.out.println("��");
         clntSock.close();
      }catch(IOException e){
         entry.add("Exception =" + e.getMessage());//����
      }      
      logger.writeEntry(entry);
   }
}

   //�� ������ 
   
   /*} catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
}
try {
} catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
}*/
//������Ϳ�~
//BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));//�޴� ��      
//PrintWriter sendWriter = null;
/*try {
   sendWriter = new PrintWriter(clntSock.getOutputStream());
} catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
}*///������ �� 
  //����� ��� ���!! �������� �ڵ� ������ �ֱ� GiveCurrentSubwayPosition findSubwayPosition = new GiveCurrentSubwayPosition(currentTimeStr);//Time �޴� �κ�
      //System.out.println(""+findSubwayPosition.getmm()+" "+findSubwayPosition.getss());
      // System.out.println(FindSubwayPosition.GiveCurrentSubwayPosition(currentTimeStr));
     
    //  String sendDataString = "Enter your destination station: ";
 /*int sendDataString = 1;   
System.out.print(sendDataString);
     sendWriter.println(sendDataString+'\n');*///������ 
      /*Read in line from socket
     /* clientSentence = in.readLine();//client�� ���� ���� �κ�
      SeatInformation seatInfrom = new SeatInformation(clientSentence);
      System.out.println(clientSentence+"\n");//��õ�� ��� �� �κ��� �������� ����ؔf
      outToServer.println(clientSentence);//��õ���� �� �κ��� ����! 
     
      //���������~
     */
/*int recvMsgSize;
int totalBytesEchoed = 0;
byte[] echoBuffer = new byte[BUFSIZE];
//Receive until client closes connection, indicated by -1


while((recvMsgSize = in.read()) != -1){//Ŭ���̾�Ʈ�� ������ ���� �� ���� ��� �ݺ��� 
   out.write(echoBuffer, 0, recvMsgSize);
   bos.write(echoBuffer,0,recvMsgSize);
}
byte[] bt = bos.toByteArray();
String st = new String(bt);
// System.out.println("Received data : " + new String(out.toByteArray())); 
entry.add("hi ggg Client finished; echoed "+ totalBytesEchoed+"bytes.");      
}catch (IOException e){
entry.add("Exception ="+ e.getMessage());
}
   */