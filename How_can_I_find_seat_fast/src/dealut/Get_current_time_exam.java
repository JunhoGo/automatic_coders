package dealut;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Getting a current time and return to client
public class Get_current_time_exam {
   
   public static String GetCurrentTimeExam(){
      Calendar calendar = Calendar.getInstance();
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      String str = dateFormat.format(calendar.getTime());       
      
      return str;   
      
      }
}