package dealut;
import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.net.Socket;
import java.net.ServerSocket;
//Each client have that class
//SERVER
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
 
         //Get the input and output I/O streams from socket
         try {
 			 String str= in.readLine();
 			 
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

			//Send to all 8 seat information
            out.println(current_all_seat.get(0));
            out.println(current_all_seat.get(1));
            out.println(current_all_seat.get(2));
            out.println(current_all_seat.get(3));
            out.println(current_all_seat.get(4));
            out.println(current_all_seat.get(5));
            out.println(current_all_seat.get(6));
            out.println(current_all_seat.get(7));

            //Fast seat is that
            int fast_seat = find_all.get_fast_seat(current,destination);
            //Send to client
            out.println(fast_seat);

            //input at that queue
            find_all.Queue(fast_seat, current, destination, true);
            //넣었다.
            
            
            //Wait a minutes
            
            
            int one_more_seat = in.read();
            find_all.Queue(one_more_seat, 0, 0, false);

         }catch (IOException e){
             entry.add("Exception =" + e.getMessage());//여기
         }
      try{//close socket
         clntSock.close();
      }catch(IOException e){
         entry.add("Exception =" + e.getMessage());
      }      
      logger.writeEntry(entry);
   }
}
