
public class ConvertToInt {
	private int intStation;
	public int ConvertToInt(String station){
		switch(station){
		case "����": 
			return 1;
		case "��Ƽ": 
			return 2;
		case "����": 
			return 3;
		case "����": 
			return 4;
		case "������": 
			return 5;
		case "�����Ա�": 
			return 6;
		case "����": 
			return 7;
		case "����": 
			return 8;
		case "��õ��": 
			return 9;
		default:
			return 0;
		}
	}
}
