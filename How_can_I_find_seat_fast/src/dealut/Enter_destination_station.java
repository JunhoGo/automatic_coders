package dealut;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Enter_destination_station extends JFrame/* extends TCP_echo_client*/ {
    
   static int hi = 0;
   int destStation = 0;
  // private final Action action = new SwingAction();
 //  private final Action action_1 = new SwingAction_1();
   static JFrame Jframe = null;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Enter_destination_station frame = new Enter_destination_station("hi");
            //  int hi =  frame.Enter_destination_station_GUI(2);
               //!!!!!!!!!!!여기서 오류나여!!!! 
               //frame.Jframe.setVisible(true);

            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public Enter_destination_station(String currentStation) {

	      //hello++;
	     JFrame a = new JFrame();
	     //int station = 0;
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     a.setBounds(0, 0, 805, 505);
	     a.getContentPane().setLayout(null);
	      
	      JButton btnNewButton = new JButton("");
	    
	      
	      btnNewButton.setForeground(Color.WHITE);
	      btnNewButton.setIcon(new ImageIcon("green.PNG"));
	      btnNewButton.setBounds(90, 262, 34, 25);
	      //btnNewButton.setBorderPainted(false);
	      a.getContentPane().add(btnNewButton);
	      btnNewButton.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	            hi = 1;
	            System.out.println(hi);
	            re(1);	            System.out.println("Complete");

	          }
	       });
	      
	      JButton button = new JButton("");
	      button.setIcon(new ImageIcon("white.PNG"));
	      button.setBounds(156, 262, 34, 25);
	      button.setBorderPainted(false);
	      a.getContentPane().add(button);
	      button.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 2;	            System.out.println(hi);
	             re(2);
	          }
	       });
	      
	      JButton button_1 = new JButton("");
	      button_1.setIcon(new ImageIcon("orange.PNG"));
	      button_1.setBounds(222, 262, 34, 25);
	      button_1.setBorderPainted(false);
	      a.getContentPane().add(button_1);
	      button_1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 3;	            System.out.println(hi);
	             re(3);
	          }
	       });
	      
	      JButton button_2 = new JButton("");
	      button_2.setIcon(new ImageIcon("white.PNG"));
	      button_2.setBounds(294, 262, 34, 25);
	      button_2.setBorderPainted(false);
	      a.getContentPane().add(button_2);
	      button_2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 4;	            System.out.println(hi);
	             re(4);
	          }
	       });
	      
	      JButton button_3 = new JButton("");
	      button_3.setIcon(new ImageIcon("white.PNG"));
	      button_3.setBounds(361, 262, 34, 25);
	      button_3.setBorderPainted(false);
	      a.getContentPane().add(button_3);
	      button_3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 5;	            System.out.println(hi);
	             re(5);
	          }
	       });
	      
	      JButton button_4 = new JButton("");
	      button_4.setIcon(new ImageIcon("white.PNG"));
	      button_4.setBounds(424, 262, 34, 25);
	      button_4.setBorderPainted(false);
	      a.getContentPane().add(button_4);
	      button_4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 6;	            System.out.println(hi);
	             re(6);
	          }
	       });
	      
	      JButton button_5 = new JButton("");
	      button_5.setIcon(new ImageIcon("orange.PNG"));
	      button_5.setBounds(498, 262, 34, 25);
	      button_5.setBorderPainted(false);
	      a.getContentPane().add(button_5);
	      button_5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 7;	            System.out.println(hi);
	             re(7);
	          }
	       });
	      
	      JButton button_6 = new JButton("");
	      button_6.setIcon(new ImageIcon("red.PNG"));
	      button_6.setBounds(561, 262, 34, 25);
	      button_6.setBorderPainted(false);
	      a.getContentPane().add(button_6);
	      button_6.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 8;	            System.out.println(hi);
	             re(8);
	          }
	       });
	      
	      JButton button_7 = new JButton("");
	      button_7.setIcon(new ImageIcon("white.PNG"));
	      button_7.setBounds(645, 262, 34, 25);
	      button_7.setBorderPainted(false);
	      a.getContentPane().add(button_7);
	      button_7.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             //여기에 넣어 예지얌
	             //setVisible(false);
	             hi = 9;	            System.out.println(hi);
	             re(9);
	          }
	       });
	      
	      JLabel lblNewLabel_1 = new JLabel(currentStation);
	      lblNewLabel_1.setBounds(184, 59, 99, 35);
	     
	      a.getContentPane().add(lblNewLabel_1);
	      
	      
	      JLabel lblNewLabel = new JLabel("");
	      lblNewLabel.setBounds(0, 0, 789, 450);
	      lblNewLabel.setIcon(new ImageIcon("dest.png"));
	      a.getContentPane().add(lblNewLabel);
	      System.out.println("hi");
	      
	      a.setVisible(true);
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
	        System.out.println("드디어! "+destStation+" 이게 내 dest임!");

	      destStation=hi;
	   }
	   public int getDesination(){
	        System.out.println("드디어! "+destStation+" 이게 내 dest임!");

	       return destStation;
	    }
  
   /*private class SwingAction extends AbstractAction {
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
   }*/
}