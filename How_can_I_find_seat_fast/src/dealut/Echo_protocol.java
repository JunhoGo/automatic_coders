package dealut;
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
      Get_current_time_exam currentTime = new Get_current_time_exam();//Time 받는 부분
      String currentTimeStr = currentTime.GetCurrentTimeExam();
      entry.add("current time is "+currentTimeStr);//여기까지는 잘 돼 !!! 
 
         System.out.println("hi 여기 오니?");
         //Get the input and output I/O streams from socket
         try {
 			System.out.println("Hello!호호");
 			 String str= in.readLine();
 			 System.out.println("소개"+str);
 			 
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
            //8개 전부 보내줘!
			

			
            out.println(current_all_seat.get(0));
            System.out.println("자리에 찍는 그 수!! 0번 "+current_all_seat.get(0));

            out.println(current_all_seat.get(1));
            out.println(current_all_seat.get(2));
            out.println(current_all_seat.get(3));
            out.println(current_all_seat.get(4));
            out.println(current_all_seat.get(5));
            out.println(current_all_seat.get(6));
            out.println(current_all_seat.get(7));

            //최종자리를 보내줘 
            //이게 클라이언트가 자리 배치표에 찍는 그 자리임!
            int here = find_all.get_fast_seat(current,destination);
            //가장 빠른 곳을 찾아
            out.println(here);

            find_all.Queue(here, current, destination, true);
            System.out.println("ADD했습니닷 들어왔다!!");
            //넣었다.
            
            
            //잠시후
            
            
            int one_more_seat = in.read();
            find_all.Queue(one_more_seat, 0, 0, false);

            //클라이언트
	      
          //  out.println(current_all_seat);
         }catch (IOException e){
             entry.add("Exception =" + e.getMessage());//여기
         }
      try{//close socket
      ///   System.out.println("끝");
         clntSock.close();
      }catch(IOException e){
         entry.add("Exception =" + e.getMessage());//여기
      }      
      logger.writeEntry(entry);
   }
}

   //밑 오케이 
   
   /*} catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
}
try {
} catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
}*/
//여기부터요~
//BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));//받는 것      
//PrintWriter sendWriter = null;
/*try {
   sendWriter = new PrintWriter(clntSock.getOutputStream());
} catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
}*///보내는 것 
  //여기는 잠깐 대기!! 범수오빠 코드 받으면 넣기 GiveCurrentSubwayPosition findSubwayPosition = new GiveCurrentSubwayPosition(currentTimeStr);//Time 받는 부분
      //System.out.println(""+findSubwayPosition.getmm()+" "+findSubwayPosition.getss());
      // System.out.println(FindSubwayPosition.GiveCurrentSubwayPosition(currentTimeStr));
     
    //  String sendDataString = "Enter your destination station: ";
 /*int sendDataString = 1;   
System.out.print(sendDataString);
     sendWriter.println(sendDataString+'\n');*///보내기 
      /*Read in line from socket
     /* clientSentence = in.readLine();//client로 부터 받은 부분
      SeatInformation seatInfrom = new SeatInformation(clientSentence);
      System.out.println(clientSentence+"\n");//가천대 라고 쓴 부분을 서버에서 출력해봣
      outToServer.println(clientSentence);//가천대라고 쓴 부분을 보내! 
     
      //여기까지요~
     */
/*int recvMsgSize;
int totalBytesEchoed = 0;
byte[] echoBuffer = new byte[BUFSIZE];
//Receive until client closes connection, indicated by -1


while((recvMsgSize = in.read()) != -1){//클라이언트가 연결을 끊을 때 까지 계속 반복함 
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