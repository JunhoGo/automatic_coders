//http://blog.naver.com/shumin/220352549235
import java.util.Collections;

//Queue�� ArrayList�� �̿��ؼ� ������! 
public class Current_seat {
		int find_station = 0;
		//seat_destination.add
		//pre_seat_information = seat_information;
	
	//���⼭�� ��̸� �˷��� 
	public synchronized arrayList[] get_current_seat(){
		Queue(num)
		for(int i=0;i<9;i++){
			array_list[i] = Queue(i,0,0,true); //���� �� ���� �ִ� ���� �޾ƿ;��� ! 
		}
		return array_list;
		
	}
	//���� ���� �� ������ �� 
	public int get_fast_station(){
		return find_station;
	}
	public synchronized void Queue(int num, int current, int dest, boolean in){ // �� �ڸ����� ������ ���� 
								  // num�� �ڸ�  	������ 	�������� ������ ��
		//��ũ�� ����Ʈ ����� ���⼭ ����! ���� �ۿ��� ���� ��
		//LinkedList<int>[7] eachSeatQueue = new LinkedList<int>()
		//					�̰� �ǳ�?
		
		//�ڱ⸦ �ֱ� ���� ���� ���� ���� �������� ������ queueã��
		int find_station = find_fast_station(current);
		if(in==true)//���� �Ŷ�� 
		{
		for(int i=0;i<7;i++){
			if(num==i)//
			�� ��ũ�忡 ����Ʈ �ֱ�
			eachSeatQueue[num].add(dest);
			}
		}
		else//���� �����ؼ� ������ �Ŷ�� 
		{
			for(int i=0;i<7;i++){
				if(num==i)
				�� ��ũ�忡 ����Ʈ �ֱ� 
				eachSeatQueue[num].delete(dest);
				}
		}
		��� �ʱ�ȭ! (���� Ŭ���̾�Ʈ���� ���� �� !)
	}
	
	private synchronized int get_fast_station(int current) {
		// TODO Auto-generated method stub
		//���翪���� ���� ���� ���� ������ �� ! 
		//ã���� 
		//pre_seat_information�� ���� 
		int find = 0;
		int find_index = 0;
		for(find = (current+1)%9;;current++){
			find_index = Collections.binarySearch(list, find);
			if(find_index == find)
				break;
			else
				continue;
		}
		return find;
	}
}
