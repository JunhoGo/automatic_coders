


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


public class Enter_destination_station/* extends TCP_echo_client*/ {
	  private int hi = 0;

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
            	Enter_destination_station frame = new Enter_destination_station();
            //  int hi =  frame.Enter_destination_station_GUI(2);
               //!!!!!!!!!!!���⼭ ��������!!!! 
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   //@SuppressWarnings("null")
  public int enter_destination_station(int hi) {

     // hi++;
     JFrame a = new JFrame();
     //int station = 0;
      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100, 100, 789, 450);
     a.getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("");
    
      
      btnNewButton.setForeground(Color.BLACK);
      btnNewButton.setIcon(new ImageIcon("green.PNG"));
      btnNewButton.setBounds(90, 262, 34, 25);
      a.getContentPane().add(btnNewButton);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
            hi = 1;

          }
       });
      
      JButton button = new JButton("");
      button.setIcon(new ImageIcon("white.PNG"));
      button.setBounds(156, 262, 34, 25);
      a.getContentPane().add(button);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 2;
          }
       });
      
      JButton button_1 = new JButton("");
      button_1.setIcon(new ImageIcon("orange.PNG"));
      button_1.setBounds(222, 262, 34, 25);
      a.getContentPane().add(button_1);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 3;
          }
       });
      
      JButton button_2 = new JButton("");
      button_2.setIcon(new ImageIcon("white.PNG"));
      button_2.setBounds(294, 262, 34, 25);
      a.getContentPane().add(button_2);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             setVisible(false);
        	  hi = 4;
          }
       });
      
      JButton button_3 = new JButton("");
      button_3.setIcon(new ImageIcon("white.PNG"));
      button_3.setBounds(361, 262, 34, 25);
      a.getContentPane().add(button_3);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 5;
          }
       });
      
      JButton button_4 = new JButton("");
      button_4.setIcon(new ImageIcon("white.PNG"));
      button_4.setBounds(424, 262, 34, 25);
      a.getContentPane().add(button_4);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 3;
          }
       });
      
      JButton button_5 = new JButton("");
      button_5.setIcon(new ImageIcon("orange.PNG"));
      button_5.setBounds(498, 262, 34, 25);
      a.getContentPane().add(button_5);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 4;
          }
       });
      
      JButton button_6 = new JButton("");
      button_6.setIcon(new ImageIcon("red.PNG"));
      button_6.setBounds(561, 262, 34, 25);
      a.getContentPane().add(button_6);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 5;
          }
       });
      
      JButton button_7 = new JButton("");
      button_7.setIcon(new ImageIcon("white.PNG"));
      button_7.setBounds(645, 262, 34, 25);
      a.getContentPane().add(button_7);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 6;
          }
       });
      
      JLabel lblNewLabel_1 = new JLabel("station");
      lblNewLabel_1.setBounds(184, 59, 99, 35);
      a.getContentPane().add(lblNewLabel_1);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 7;
          }
       });
      
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setBounds(0, 0, 789, 450);
      lblNewLabel.setIcon(new ImageIcon("dest.png"));
      a.getContentPane().add(lblNewLabel);
      System.out.println("hi");
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             //���⿡ �־� ������
             //setVisible(false);
        	  hi = 8;
          }
       });
      a.setVisible(true);
      System.out.println("Station�� !!! �ٷ� "+hi);
      return hi;
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