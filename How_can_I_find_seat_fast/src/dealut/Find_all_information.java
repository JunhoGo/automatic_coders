package dealut;
//http://blog.naver.com/shumin/220352549235
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//Queue�� ArrayList�� �̿��ؼ� ������! 
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
	   System.out.println("get_current_seat�� ��!");
	   hi++;
      for(int i=1;i<9;i++){
    	  System.out.println("���� i�� ="+i);
    	  int ho = Queue(i,0,0,true);
    	  System.out.println("ho i= "+i+" i�� �Ǹ������� �ִ� ����! = "+ho);
    	  showSeat.add(i-1,ho); //���� �� ���� �ִ� ���� �޾ƿ;��� ! 
      }
      return showSeat;    
   }

   public static synchronized int Queue(int num, int current, int dest, boolean in){ // �� �ڸ����� ������ ���� 
	   										// num�� �ڸ�     ������    �������� ������ ��
     
      //�ڱ⸦ �ֱ� ���� ���� ���� ���� �������� ������ queueã��
	
      try{if(in&&current!=0&&current!=0)//���� �Ŷ�� 
      {
    	  System.out.println("ADD�ǰ� �ִ� �̤̤̤̤̤̤̤̤̤̤�����!!�ϴ� ���̾� ���� num�� "+num);

    	  switch(num){
      case 1:
    	  EachSeatQueue1.addLast(dest);
    	  System.out.println("EachSeatQueue1.add(0,dest); �߳�????????");
    	  break;
     case 2:
    	 EachSeatQueue2.addLast(dest);    
   	  System.out.println("EachSeatQueue2.add(1,dest); �߳�????????");
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
      else if(in&&current ==0 && dest ==0){//�� �������� �ñ��� ģ��
    	  System.out.println("���� �� �������� �ִ� ģ���˾Ƴ��� ����/??");

    	  switch(num){
          case 1: 
        	  System.out.println(EachSeatQueue1.getLast());
        	  try{
		    	   System.out.println(EachSeatQueue1.getLast());
		    	 }catch (NoSuchElementException e) { 
		    		   return 1;
		    	  } 
        	 
    		 System.out.println("�Ǹ������� �ִ� ģ���� ...!! null�� �ƴϴ�!!!!!!!");

        	  return EachSeatQueue1.getLast();
          case 2:
        	  System.out.println("���� else if ����/??");
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
        	  System.out.println("�̻��� �߸��߾� �� !!! EachSeatQueue9.getLast(); ");
        	  break;
    	  }
      }
      else//���� �����ؼ� ������ �Ŷ�� / in�� false���
      {
    	  System.out.println("�����???");
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
     	  System.out.println("�̻��� �߸��߾� �� !!! EachSeatQueue9.remove(EachSeatQueue9.size()); ");
     	  break;
       }
      }
      //��� �ʱ�ȭ! (���� Ŭ���̾�Ʈ���� ���� �� !)
      return 0;
      } catch (NoSuchElementException e){
    	  return 0;
      }
   }
   
   public static synchronized int get_fast_seat(int current,int dest) {
      // TODO Auto-generated method stub
      //���翪���� ���� ���� ���� ������ �� ! 
      //ã���� 
      //pre_seat_information�� ���� 
	   System.out.println("����� �̤̤̤̤̤̤̤̤�? �ФФФФа��� ���� �ڸ� ã���� ���� current�� ����? "+current);
      int find = 0;
      int find_index = 0;  
    		  if(showSeat.get(0)==0)
    			  return 1;
    		  else if(showSeat.get(1)==0)
    			  return 2;
    		  else if(showSeat.get(2)==0)
    			  return 3;
    		  else if(showSeat.get(3)==0)
    			  return 4;
    		  else if(showSeat.get(4)==0)
    			  return 5;
    		  else if(showSeat.get(5)==0)
    			  return 6;
    		  else if(showSeat.get(6)==0)
    			  return 7;
    		  else if(showSeat.get(7)==0)
    			  return 8;
    		  
   
    		  
    		  find = current+1;//0���� 8�� ���� ��������??? ����ö ���� �� 9�� ��  ���� �ڸ��� 8�ڸ��� ����
 	         System.out.println("current"+current);
 	         int k= 0;
	
 	         while(find>=current&&find<dest){
 	        	 System.out.println("hi!");
 	        	 k= 0;
 	        	 while(showSeat.get(k)!=find){
	    		  
	    			   System.out.println(k+" �� �ƴϾ�!!");
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
