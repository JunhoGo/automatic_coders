package dealut;
//http://blog.naver.com/shumin/220352549235
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//Queue와 ArrayList를 이용해서 만들자! 
public class Find_all_information {
	
	int find_station = 0;
	static ArrayList<Integer> showSeat = new ArrayList<Integer>(8);
	static LinkedList<Integer> EachSeatQueue1 = new LinkedList<Integer>();
   //	EachSeatQueue1.add(0);
	static LinkedList<Integer> EachSeatQueue2 = new LinkedList<Integer>();
   // EachSeatQueue2.add(0);
	static LinkedList<Integer> EachSeatQueue3 = new LinkedList<Integer>();
    //EachSeatQueue3.add(0);
	static LinkedList<Integer> EachSeatQueue4 = new LinkedList<Integer>();
   // EachSeatQueue4.add(0);
	static LinkedList<Integer> EachSeatQueue5 = new LinkedList<Integer>();
   // EachSeatQueue5.add(0);
	static LinkedList<Integer> EachSeatQueue6 = new LinkedList<Integer>();
  //  EachSeatQueue6.add(0);
	static LinkedList<Integer> EachSeatQueue7 = new LinkedList<Integer>();
   // EachSeatQueue7.add(0);
	static LinkedList<Integer> EachSeatQueue8 = new LinkedList<Integer>();
    //EachSeatQueue8.add(0);
	static LinkedList<Integer> EachSeatQueue9 = new LinkedList<Integer>();
    //EachSeatQueue9.add(0);
	
   public synchronized ArrayList<Integer> get_current_seat(int hi){
     // Queue(num)
	   System.out.println("get_current_seat에 옴!");
	   hi++;
      for(int i=1;i<9;i++){
    	  System.out.println("나는 i얌 ="+i);
    	  int ho = Queue(i,0,0,true);
    	  System.out.println("ho i= "+i+" i의 맨마지막에 있는 것은! = "+ho);
    	  showSeat.add(i-1,ho); //현재 맨 끝에 있는 것을 받아와야해 ! 
      }
      return showSeat;    
   }

   public static synchronized int Queue(int num, int current, int dest, boolean in){ // 각 자리마다 가지고 있음 
	   										// num은 자리     목적지    나가는지 들어오는 지
     
      //자기를 넣기 전에 먼저 가장 작은 목적지를 가지는 queue찾기
	
      try{if(in&&current!=0&&current!=0)//들어온 거라면 
      {
    	  System.out.println("ADD되고 있니 ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ제발!!하는 곳이얌 나의 num은 "+num);

    	  switch(num){
      case 1:
    	  EachSeatQueue1.addLast(dest);
    	  System.out.println("EachSeatQueue1.add(0,dest); 했나????????");
    	  break;
     case 2:
    	 EachSeatQueue2.addLast(dest);    
   	  System.out.println("EachSeatQueue2.add(1,dest); 했나????????");
	  break;

     case 3:
    	 EachSeatQueue3.addLast(dest);
   	  break;

     case 4:
    	 EachSeatQueue4.addLast(dest);
   	  break;

     case 5:
    	 EachSeatQueue5.addLast(dest);
   	  break;

     case 6:
         EachSeatQueue6.addLast(dest);
   	  break;

     case 7:
         EachSeatQueue7.addLast(dest);
   	  break;

     case 8:
         EachSeatQueue8.addLast(dest);
   	  break;

     case 9:
         EachSeatQueue9.addLast(dest);
   	  break;

     }
    	  
       
      }
      else if(in&&current ==0 && dest ==0){//맨 마지막만 궁금한 친구
    	  System.out.println("여기 맨 마지막에 있는 친구알아내기 들어옴/??");

    	  switch(num){
          case 1: 
        	  System.out.println(EachSeatQueue1.getLast());
        	  try{
		    	   System.out.println(EachSeatQueue1.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 1;
		    	  } 
        	 
    		 System.out.println("맨마지막에 있는 친구는 ...!! null이 아니다!!!!!!!");

        	  return EachSeatQueue1.getLast();
          case 2:
        	  System.out.println("여기 else if 들어옴/??");
        	  try{
		    	   System.out.println(EachSeatQueue2.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 2;
		    	  } 
        	  return EachSeatQueue2.getLast();
          case 3:
        	  try{
		    	   System.out.println(EachSeatQueue3.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 3;
		    	  } 
        	  return EachSeatQueue3.getLast();
          case 4:
        	  try{
		    	   System.out.println(EachSeatQueue4.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 4;
		    	  } 
        	  return EachSeatQueue4.getLast();
          case 5:
        	  try{
		    	   System.out.println(EachSeatQueue5.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 5;
		    	  } 
        	  return EachSeatQueue5.getLast();
          case 6:
        	  try{
		    	   System.out.println(EachSeatQueue6.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 6;
		    	  } 
        	  return EachSeatQueue6.getLast();
          case 7:
        	  try{
		    	   System.out.println(EachSeatQueue7.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 7;
		    	  } 
        	  return EachSeatQueue7.getLast();
          case 8:
        	  try{
		    	   System.out.println(EachSeatQueue8.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 8;
		    	  } 
        	  return EachSeatQueue8.getLast();
          case 9:
        	  try{
		    	   System.out.println(EachSeatQueue9.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 9;
		    	  } 
        	  return EachSeatQueue9.getLast();
          default:
        	  System.out.println("이상해 잘못했어 너 !!! EachSeatQueue9.getLast(); ");
        	  break;
    	  }
      }
      else//역에 도착해서 나가는 거라면 / in이 false라면
      {
    	  System.out.println("여기옴???");
    	  int str = 0;
       switch(num){
       case 1:
            //EachSeatQueue1.remove(EachSeatQueue1.size());
    	   str = EachSeatQueue1.poll();
    	   System.out.println("str : "+str);
      	  break;

       case 2:
           //EachSeatQueue2.remove(EachSeatQueue2.size());
    	   str = EachSeatQueue2.poll();
     	  break;

       case 3:
           //EachSeatQueue3.remove(EachSeatQueue3.size());
    	   str =  EachSeatQueue3.poll();
     	  break;

       case 4:
           //EachSeatQueue4.remove(EachSeatQueue4.size());
    	   str =  EachSeatQueue4.poll();
     	  break;

       case 5:
           //EachSeatQueue5.remove(EachSeatQueue5.size());
    	   str = EachSeatQueue5.poll();
     	  break;

       case 6:
           //EachSeatQueue6.remove(EachSeatQueue6.size());
    	   str = EachSeatQueue6.poll();
     	  break;

       case 7:
           //EachSeatQueue7.remove(EachSeatQueue7.size());
    	   str = EachSeatQueue7.poll();
     	  break;

       case 8:
           //EachSeatQueue8.remove(EachSeatQueue8.size());
    	   str = EachSeatQueue8.poll();
     	  break;

 
       default:
     	  System.out.println("이상해 잘못했어 너 !!! EachSeatQueue9.remove(EachSeatQueue9.size()); ");
     	  break;
       }
      }
      //어레이 초기화! (먼저 클라이언트에게 보낸 후 !)
      return 0;
      } catch (NoSuchElementException e){
    	  return 0;
      }
   }
   
   public static synchronized int get_fast_seat(int current,int dest) {
      // TODO Auto-generated method stub
      //현재역에서 부터 가장 빨리 내리는 역 ! 
      //찾아줘 
      //pre_seat_information을 보고 
	   System.out.println("여기는 ㅜㅜㅜㅜㅜㅜㅜㅜㅜ? ㅠㅠㅠㅠㅠ가장 빠른 자리 찾아줘 제발 current는 뭐니? "+current);
      int find = 0;
      int find_index = 0;  
    		 
    		  if(showSeat.isEmpty())		    
    			  return 1;
    		  else if(showSeat.isEmpty())
    			  return 2;
    		  else if(showSeat.isEmpty())
    			  return 3;
    		  else if(showSeat.isEmpty())
    			  return 4;
    		  else if(showSeat.isEmpty())
    			  return 5;
    		  else if(showSeat.isEmpty())
    			  return 6;
    		  else if(showSeat.isEmpty())
    			  return 7;
    		  else if(showSeat.isEmpty())
    			  return 8;
    		  
   
    		  
    		  find = current;//0부터 8의 값이 나오겠지??? 지하철 역은 총 9개 임  현재 자리는 8자리가 있음
 	         System.out.println("current"+current);
 	         int k= 0;
	
 	         while(find>=current&&find<dest){
 	        	 System.out.println("hi!");
 	        	 k= 0;
 	        	 while(showSeat.get(k)!=find){
	    		  
	    			   System.out.println(k+" 넌 아니야!!");
	    			   k=k+1;
	    			   if(k==8){
	    				   find = find+1;
	    				   break;
	    			   }
 	        	 }
 	        	 if(k!=8){
 	        	 find_index =k;
	    	   return (find_index+1);
	    	   
 	        	 }
 	         }
 	         return -1;
   }
   }
