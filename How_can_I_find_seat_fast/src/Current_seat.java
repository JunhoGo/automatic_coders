//http://blog.naver.com/shumin/220352549235
import java.util.*;
//Queue�� ArrayList�� �̿��ؼ� ������! 
public class Current_seat {
		 Current_seat(){
			int find_station = 0;
			//seat_destination.add
			//pre_seat_information = seat_information;
			//int show_seat = new Integer;
			ArrayList<Integer> show_seat = new ArrayList<Integer>(8);
			//��ü �ڸ�
			LinkedList<Integer> eachSeatQueue = new LinkedList<Integer>();//���� ���� �˾ƺ���
		}
	//���⼭�� ��̸� �˷��� 
	public synchronized arrayList<Integer> get_current_seat(int current, int dest, boolean in){
		//Queue(0, current,dest,true);
		int dest_station = 0;
		for(int i=0;i<8;i++){
			dest_station = Queue(i,0,0,true); //���� �� ���� �ִ� ���� �޾ƿ;��� ! 
			show_seat.add(i,dest_station); //�Ḹ �̰� ���� �����ص� �ǳ�!?  
		}//�켱 �� �������� �ִ� ť�� ã���� ��! 
		return show_seat;		
	}
	public synchronized int Queue(int num, int current, int dest, boolean in){ // �� �ڸ����� ������ ���� 
								  // num�� �ڸ�  				������ 	�������� ������ ��		
		//�ڱ⸦ �ֱ� ���� ���� ���� ���� �������� ������ queueã��
		if(in==true)//���� �Ŷ�� 
		{
			find_station = get_fast_station(current);//seat�� �����ֳ���!!!
			//�� ��ũ�忡 ����Ʈ �ֱ�
			eachSeatQueue[find_station].add(dest);//�������� �� ! //�긦 ������ ��!!!
			
		}
		else if(current==0&&dest==0){
			return eachSeatQueue[num].getLast(); 
		}
		else//���� �����ؼ� ������ �Ŷ��  in ==false���!?
		{
				//�� ��ũ�忡 ����Ʈ �ֱ� 
				eachSeatQueue[num].delete(dest);// �� �ڸ��� �ִ� ���� ����! 

		}
		//��� �ʱ�ȭ! (���� Ŭ���̾�Ʈ���� ���� �� !)
	}
	
	private synchronized int get_fast_station(int current) {
		// TODO Auto-generated method stub
		//���翪���� ���� ���� ���� ������ �� ! 
		//ã���� 
		//pre_seat_information�� ���� 
		int find = 0;
		int find_index = 0;
		for(find = (current+1)%9;;current++){
			find_index = Collections.binarySearch(show_seat, find);//array List 
			if(find_index == find)
				break;
		}
		return find_index;//���� ���� seat�̾�� ��!!!
	}
}
