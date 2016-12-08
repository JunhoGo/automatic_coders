package dealut;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class location  {
	
public int find_current_station(int hi) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	hi = hi ++;
		Calendar calendar = Calendar.getInstance();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  
	    String s = dateFormat.format(calendar.getTime());
	    System.out.println(s);
	    System.out.println("subway started");
	    String mm = s.substring(14, 16);
	    int new_mm = Integer.parseInt(mm);
	    String ss=s.substring(17,19);
	    int new_ss = Integer.parseInt(ss);
	    int sum = (new_ss+(new_mm*60))%1200;
	 System.out.println("sum  "+sum);
	 if(hi==100){
		 if(sum>=0 && sum<=120)
		 {
		    return 1;
		 }
		 else if(sum>120&&sum<=240)
		 {
			 return 2;
		 }
		 else if(sum>240&&sum<=360)
		    {
		 return 3;
		    }
		 else if(sum>360&&sum<=480)
		    {
		    return 4;
		    }
		 else if(sum>480&&sum<=600)
		    {
		    return 5;
		    }
		 else if(sum>600&&sum<=720)
		    {
		    return 6;
		    }
		 else if(sum>720&&sum<=940)
		    {
		    return 7;
		    }
		 else if(sum>950&&sum<=1160)
		 {
		 return 8;
		    }
		 else if(sum>1160&&sum<=1200)
		 {
		    return 9;
		 }//이상해
		 else{
			 return 0;
		 }
	 }
	 
	 if(sum>=0 && sum<=110)
	 {
	    return 1;
	 }
	 else if(sum>110&&sum<=230)
	 {
		 return 2;
	 }
	 else if(sum>230&&sum<=350)
	    {
	 return 3;
	    }
	 else if(sum>350&&sum<=470)
	    {
	    return 4;
	    }
	 else if(sum>470&&sum<=590)
	    {
	    return 5;
	    }
	 else if(sum>590&&sum<=710)
	    {
	    return 6;
	    }
	 else if(sum>710&&sum<=930)
	    {
	    return 7;
	    }
	 else if(sum>930&&sum<=1150)
	 {
	 return 8;
	    }
	 else if(sum>1150&&sum<=1200)
	 {
	    return 9;
	 }//이상해
	 else{
		 return 0;
	 }
	}
}
