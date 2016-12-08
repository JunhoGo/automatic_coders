package dealut;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//Using Queue and ArrayList makes each seat and current seat
public class Find_all_information {
	
	int find_station = 0;
	//current seat information
	static ArrayList<Integer> showSeat = new ArrayList<Integer>(8);
	
	//each seat queue
	static LinkedList<Integer> EachSeatQueue1 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue2 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue3 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue4 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue5 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue6 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue7 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue8 = new LinkedList<Integer>();
	static LinkedList<Integer> EachSeatQueue9 = new LinkedList<Integer>();

	//find current seat information
   public synchronized ArrayList<Integer> get_current_seat(int hi){
	   hi++;
      for(int i=1;i<9;i++){
    	  int ho = Queue(i,0,0,true);
    	//Getting current final seat information(current seating people) 
    	  showSeat.add(i-1,ho); 
      }
      //Give to client, show the current seat information(detect duplication)
      return showSeat;    
   }

   //Each queue organization
   public static synchronized int Queue(int num, int current, int dest, boolean in){  
	   									// num: seat number                     in: is it go out or in
     
	//Before input the seat, find queue that has the closest destination from current(parameter) 
      //If it is in come 
	   try{if(in&&current!=0&&current!=0) 
      {
    	  switch(num){
      case 1:
    	  EachSeatQueue1.addLast(dest);
    	  break;
     case 2:
    	 EachSeatQueue2.addLast(dest);    
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
	   
	   //What is that queue's final destination? 
      else if(in&&current ==0 && dest ==0){
    	  switch(num){
          case 1: 
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue1.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 1;
		    	  } 
        	  return EachSeatQueue1.getLast();
          case 2:
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue2.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 2;
		    	  } 
        	  return EachSeatQueue2.getLast();
          case 3:
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue3.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 3;
		    	  } 
        	  return EachSeatQueue3.getLast();
          case 4:
        	  //If last queue is empty then return to own seat
        	  	try{
		    	   System.out.println(EachSeatQueue4.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 4;
		    	  } 
        	  return EachSeatQueue4.getLast();
          case 5:
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue5.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 5;
		    	  } 
        	  return EachSeatQueue5.getLast();
          case 6:
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue6.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 6;
		    	  } 
        	  return EachSeatQueue6.getLast();
          case 7:
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue7.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 7;
		    	  } 
        	  return EachSeatQueue7.getLast();
          case 8:
        	  //If last queue is empty then return to own seat
        	  try{
		    	   System.out.println(EachSeatQueue8.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 8;
		    	  } 
        	  return EachSeatQueue8.getLast();
         //If strange then come in
          default:
        	  break;
    	  }
      }
	   
	   //It arrive at destination station then remove the original information
	   //If in is false
      else
      {
    	  int str = 0;
       switch(num){
       case 1:
    	   str = EachSeatQueue1.poll();
      	  break;
       case 2:
    	   str = EachSeatQueue2.poll();
     	  break;
       case 3:
    	   str =  EachSeatQueue3.poll();
     	  break;
       case 4:
    	   str =  EachSeatQueue4.poll();
     	  break;
       case 5:
    	   str = EachSeatQueue5.poll();
     	  break;
       case 6:
    	   str = EachSeatQueue6.poll();
     	  break;
       case 7:
           //EachSeatQueue7.remove(EachSeatQueue7.size());
    	   str = EachSeatQueue7.poll();
     	  break;

       case 8:
    	   str = EachSeatQueue8.poll();
     	  break;

     	  //If it has strange information
       default:
     	  break;
       }
      }
      return 0;
      } catch (NoSuchElementException e){
    	  return 0;
      }
   }
   
   //Find fast seat! from compare current station
   public static synchronized int get_fast_seat(int current,int dest) {
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
    		  
   
    		  //All seat already full then go to that syntax
    		  find = current;
 	         int k= 0;
	
 	         while(find>=current&&find<dest){
 	        	 k= 0;
 	        	 while(showSeat.get(k)!=find){
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
