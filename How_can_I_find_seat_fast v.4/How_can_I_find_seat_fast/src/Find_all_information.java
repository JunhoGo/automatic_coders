//http://blog.naver.com/shumin/220352549235
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//Queue�� ArrayList�� �̿��ؼ� ������! 
public class Find_all_information {
	int find_station = 0;
	static ArrayList<Integer> showSeat = new ArrayList<Integer>(8);
 
	
   public synchronized ArrayList<Integer> get_current_seat(int hi){
     // Queue(num)
	   hi++;
      for(int i=0;i<9;i++){
    	  showSeat.add(i,Queue(i,0,0,true)); //���� �� ���� �ִ� ���� �޾ƿ;��� ! 
      }
      return showSeat;    
   }

   public static synchronized int Queue(int num, int current, int dest, boolean in){ // �� �ڸ����� ������ ���� 
                          // num�� �ڸ�     ������    �������� ������ ��
      //��ũ�� ����Ʈ ����� ���⼭ ����! ���� �ۿ��� ���� ��
      //LinkedList<int>[7] eachSeatQueue = new LinkedList<int>()
      //               �̰� �ǳ�?
	   LinkedList<Integer> EachSeatQueue1 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue2 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue3 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue4 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue5 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue6 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue7 = new LinkedList<Integer>();
	    LinkedList<Integer> EachSeatQueue8 = new LinkedList<Integer>();
      //�ڱ⸦ �ֱ� ���� ���� ���� ���� �������� ������ queueã��
      if(in==true&&current!=0&&current!=0)//���� �Ŷ�� 
      { switch(num){
      case 1:
    	  EachSeatQueue1.add(1,dest);
     case 2:
    	 EachSeatQueue2.add(2,dest);    
     case 3:
    	 EachSeatQueue3.add(3,dest);
     case 4:
    	 EachSeatQueue4.add(4,dest);
     case 5:
    	 EachSeatQueue5.add(5,dest);
     case 6:
         EachSeatQueue6.add(6,dest);
     case 7:
         EachSeatQueue7.add(7,dest);
     case 8:
         EachSeatQueue8.add(8,dest);
     }
       
      }
      else if(current ==0 && dest ==0){//�� �������� �ñ��� ģ��
    	  switch(num){
          case 1:
               return EachSeatQueue1.getLast();
          case 2:
        	  return EachSeatQueue2.getLast();
          case 3:
        	  return EachSeatQueue3.getLast();
          case 4:
        	  return EachSeatQueue4.getLast();
          case 5:
        	  return EachSeatQueue5.getLast();
          case 6:
        	  return EachSeatQueue6.getLast();
          case 7:
        	  return EachSeatQueue7.getLast();
          case 8:
        	  return EachSeatQueue8.getLast();
          }
      }
      else//���� �����ؼ� ������ �Ŷ�� / in�� false���
      {
    	  
       switch(num){
       case 1:
            EachSeatQueue1.remove(EachSeatQueue1.size());
       case 2:
           EachSeatQueue2.remove(EachSeatQueue2.size());
       case 3:
           EachSeatQueue3.remove(EachSeatQueue3.size());
       case 4:
           EachSeatQueue4.remove(EachSeatQueue4.size());
       case 5:
           EachSeatQueue5.remove(EachSeatQueue5.size());
       case 6:
           EachSeatQueue6.remove(EachSeatQueue6.size());
       case 7:
           EachSeatQueue7.remove(EachSeatQueue7.size());
       case 8:
           EachSeatQueue8.remove(EachSeatQueue8.size());
       }
      }
      //��� �ʱ�ȭ! (���� Ŭ���̾�Ʈ���� ���� �� !)
      return 0;
   }
   
   public static synchronized int get_fast_seat(int current) {
      // TODO Auto-generated method stub
      //���翪���� ���� ���� ���� ������ �� ! 
      //ã���� 
      //pre_seat_information�� ���� 
      int find = 0;
      int find_index = 0;
      while(true){
    	  find = (current+1)%9;
         find_index = Collections.binarySearch(showSeat, find);//�װ� �־�! 
         if(find_index == find)
            break;
         else if(find==8)
        	return -1;
         current++;
      }
      return find_index;
   }
}