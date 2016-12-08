package dealut;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
//글씨체 넣기 
//각각 다 확인해보기
public class Show_seat extends JFrame {
	public Show_seat() {
	}

static ArrayList<Integer> i = new ArrayList<Integer>();

	static int finish;
    private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	   i.add(1);
	   i.add(2);
	   i.add(3);
	   i.add(4);
	   i.add(5);
	   i.add(6);
	   i.add(7);
	   i.add(0);

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Show_seat frame = new Show_seat();
               frame.show_seat(i,1);
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
	public void show_seat(ArrayList<Integer> seat, int fast) {
		
		
		JPanel pane = new JPanel();
		
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(0, 0, 805, 505);
         getContentPane().setLayout(null);
         
         int seat1 = seat.get(0);
         System.out.println("안녕 나는 seat 1이야 "+seat1);
         ConvertToString ToString= new ConvertToString();
         String str1 = ToString.toString(seat1);
         JLabel lblStation = new JLabel(str1);
         JTextArea a = new JTextArea();
         lblStation.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(a);
         a.append(str1);
         System.out.println("자리에 나오는 첫번째 아이야 ^^ "+str1);
         lblStation.setBounds(92, 105, 118, 57);
         getContentPane().add(lblStation);
         
         seat1 = seat.get(1);
         System.out.println("안녕 나는 seat 2이야 "+seat1);
         str1 = ToString.toString(seat1);
         JLabel lblStation_1 = new JLabel(str1);
         JTextArea b = new JTextArea();
         lblStation_1.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(b);
         b.append(str1);
         System.out.println("자리에 나오는 두번째 아이야 ^^ "+str1);
         lblStation_1.setBounds(239, 105, 141, 57);
         getContentPane().add(lblStation_1);
         
         seat1 = seat.get(2);
         str1 = ToString.toString(seat1);
         JLabel lblStation_2 = new JLabel(str1);
         JTextArea c = new JTextArea();
         lblStation_2.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(c);
         c.append(str1);
         lblStation_2.setBounds(409, 105, 141, 57);
         getContentPane().add(lblStation_2);
        
         seat1 = seat.get(3);
         str1 = ToString.toString(seat1);
         JLabel lblStation_3 = new JLabel(str1);
         JTextArea d = new JTextArea();
         lblStation_3.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(d);
         d.append(str1);
         lblStation_3.setBounds(574, 105, 118, 57);
         getContentPane().add(lblStation_3);
         
         seat1 = seat.get(4);
         str1 = ToString.toString(seat1);
         JLabel lblStation_4 = new JLabel(str1);
         JTextArea e = new JTextArea();
         lblStation_4.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(e);
         e.append(str1);
         lblStation_4.setBounds(574, 328, 118, 57);
         getContentPane().add(lblStation_4);
         
         seat1 = seat.get(5);
         str1 = ToString.toString(seat1);
         JLabel lblStation_5 = new JLabel(str1);
         JTextArea f = new JTextArea();
         lblStation_5.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(f);
         f.append(str1);
         lblStation_5.setBounds(402, 328, 148, 57);
         getContentPane().add(lblStation_5);
         
         seat1 = seat.get(6);
         str1 = ToString.toString(seat1);
         JLabel lblStation_6 = new JLabel(str1);
         JTextArea g = new JTextArea();
         lblStation_6.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(g);
         g.append(str1);
         lblStation_6.setBounds(239, 328, 141, 62);
         getContentPane().add(lblStation_6);
         
         seat1 = seat.get(7);
         str1 = ToString.toString(seat1);
         JLabel lblStation_7 = new JLabel(str1);
         JTextArea h = new JTextArea();
         lblStation_7.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(h);
         h.append(str1);
         lblStation_7.setBounds(92, 331, 124, 57);
         getContentPane().add(lblStation_7);
         
         Integer i = fast;
         JLabel lblStation_8 = new JLabel(i.toString());
         JTextArea k = new JTextArea();
         lblStation_8.setFont(new Font("Rix비타민 M", Font.BOLD,19));
         getContentPane().add(k);
         k.append(i.toString());
         lblStation_8.setBounds(92, 400, 124, 57);
         getContentPane().add(lblStation_8);
         
         JButton JButton_back = new JButton("");
         JButton_back.setLayout(null);
         JButton_back.setBounds(0,0, 789,450);
         JButton_back.setIcon(new ImageIcon("seat.png"));
         getContentPane().add(JButton_back);
         getContentPane().setBounds(0,0,805,505);
         try {
			//DealyMethod(10);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         JButton_back.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	           //  setVisible(false);
	           re(1);
	          }
	       });
         
         setVisible(true);
         try {
			DealyMethod(5);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         //a.setVisible(true);
      }
      private class SwingAction extends AbstractAction {
         public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
         }
         public void actionPerformed(ActionEvent e) {
         }
      }
      private class SwingAction_1 extends AbstractAction {
         public SwingAction_1() {
            putValue(NAME, "SwingAction_1");
            putValue(SHORT_DESCRIPTION, "Some short description");
         }
         public void actionPerformed(ActionEvent e) {
         }
      }
      public void re(int hi)
      {
         finish=hi;
      }
      public int getDesination(){
            System.out.println(finish+"끝났나?");
            return finish;
       }
      public static void DealyMethod(int delayTime) throws Exception{
	      int mdelayTime;
	      mdelayTime = delayTime * 1000;
	      Robot robot = new Robot();
	      robot.delay(mdelayTime);
	   }
   }