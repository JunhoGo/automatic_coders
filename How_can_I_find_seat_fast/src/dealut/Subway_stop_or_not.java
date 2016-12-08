package dealut;
import java.text.SimpleDateFormat;
	import java.util.Calendar;

	//confirm subway or not not
	public class Subway_stop_or_not {

	   public static int stop_or_not() {
	      // TODO Auto-generated method stub
		   Calendar calendar = Calendar.getInstance();
	       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	       String s = dateFormat.format(calendar.getTime());
	      String mm = s.substring(14, 16);
	       int new_mm = Integer.parseInt(mm);
	      String ss=s.substring(17,19);
	      int new_ss = Integer.parseInt(ss);
	      
	      int sum = (new_ss+(new_mm*60))%1200;
	      
	      if(sum>=0 && sum<=10)
	         return 1;//stop
	      else if(sum>10&&sum<=110)
		         return 0;//run
	      else if(sum>110&&sum<=130)
		         return 1;
	      else if(sum>130&&sum<=230)
		         return 0;
	      else if(sum>230&&sum<=250)
		         return 1;
	      else if(sum>250&&sum<=350)
		         return 0;
	      else if(sum>350&&sum<=370)
		         return 1;
	      else if(sum>370&&sum<=470)
		         return 0;
	      else if(sum>470&&sum<=490)
		         return 1;
	      else if(sum>490&&sum<=590)
		         return 0;
	      else if(sum>590&&sum<=610)
		         return 1;
	      else if(sum>610&&sum<=710)
		         return 0;
	      else if(sum>710&&sum<=730)
		         return 1;
	      else if(sum>730&&sum<=930)
		         return 0;
	      else if(sum>930&&sum<=950)
		         return 1;
	      else if(sum>950&&sum<=1150)
		         return 0;
	      else if(sum>1150&&sum<=1200)
		         return 1;
	      else
	    	  return -1;
	   }

	}
