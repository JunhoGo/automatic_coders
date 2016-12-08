package dealut;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Finish_arrive extends TCP_echo_client {

   private JPanel contentPane;
   private JFrame jframe;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Finish_arrive frame = new Finish_arrive(1);
               frame.jframe.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
    public Finish_arrive(int dest) {
       jframe = new JFrame();
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jframe.setBounds(0, 0, 805, 505);
       jframe.getContentPane().setLayout(null);
       /*
        * JTextArea a = new JTextArea();
         a.setFont(new Font("Rix비타민  M", Font.BOLD,66));
         getContentPane().add(a);
         a.append(str1);
         System.out.println("자리에 나오는 첫번째 아이야 ^^ "+str1);
         lblStation.setBounds(92, 105, 118, 57);
         getContentPane().add(lblStation);
        * */
       ConvertToString ToString= new ConvertToString();
        String str1 = ToString.toString(dest);
         JLabel lblStation = new JLabel(str1);//
         lblStation.setBounds(259, 149, 220, 109);//
         JTextArea a = new JTextArea();//
         //a.setFont(new Font("Rix비타민  M", Font.BOLD,120));//
         lblStation.setFont(new Font("Rix비타민  M", Font.BOLD,20));//
  
         a.append(str1);//
         jframe.getContentPane().add(lblStation);
         
         JLabel lblNewLabel = new JLabel("");
         lblNewLabel.setBounds(0, 0, 789,450);
         lblNewLabel.setIcon(new ImageIcon("arrive.png"));
         jframe.getContentPane().add(lblNewLabel);
         System.out.println("hi");
         jframe.setVisible(true);
      }
      private class SwingAction extends AbstractAction {
         public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
         }
         public void actionPerformed(ActionEvent e) {
         }
      }
   }