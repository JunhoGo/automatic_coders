package dealut;
//That class change integer to string
public class ConvertToString {
	public String toString(int station){
		switch(station){
		case 1:
			return "선릉";
		case 2:
			return "한티";
		case 3:
			return "도곡";
		case 4:
			return "구룡";
		case 5:
			return "개포동";
		case 6:
			return "대모산입구";
		case 7:
			return "수서";
		case 8:
			return "복정";
		case 9:
			return "가천대";
		case 0:
			return " ";
		default:
			return "잘못입력함.";

		}
	}
}
