package dealut;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wrong_information extends TCP_echo_client {

   private JPanel contentPane;
   JFrame Wrong_information;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      System.out.println("여기는 main\n");

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	Wrong_information frame = new Wrong_information();
               frame.Wrong_information.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frameIntro_inform.setBounds(100, 100, 805, 505);

 //  Intro_inform.setSize(805,505); btnNewButton.setBounds(0, 0, 789, 450);
    */
   public Wrong_information() {
      System.out.println("여기는 Intro_inform construct\n");
            initialize();
   }
   public void initialize(){
      System.out.println("여기는 initialize\n");

      Wrong_information = new JFrame();//
      Wrong_information.getContentPane().setLayout(null);
      Wrong_information.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Wrong_information.setBounds(560,260, 805, 505);
      Wrong_information.setBounds(0,0, 805, 505);

      Wrong_information.setSize(805,505); 
      contentPane = new JPanel();
      Wrong_information.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
      Wrong_information.setBounds(0, 0, 805, 505);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      Wrong_information.setContentPane(contentPane);//
      
      JButton btnNewButton = new JButton("New button");
      btnNewButton.setIcon(new ImageIcon("wrong.png"));

      contentPane.setLayout(null);
      btnNewButton.setBounds(0,0, 789, 450);//0, 0, 789, 450);원래
      
      Wrong_information.getContentPane().add(btnNewButton);
       this.Wrong_information.setVisible(true);
   }

}