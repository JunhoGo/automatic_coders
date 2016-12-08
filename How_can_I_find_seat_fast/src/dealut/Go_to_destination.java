package dealut;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Robot;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

//Enter the station through take off station
//Show moved subway and each station image 
public class Go_to_destination extends JFrame{
   public int go_to_destination(int current,int dest) throws Exception{
      int i = 1;
      int stop = -1;
      int next_station = 0;
      int check = 0;
      JFrame Jframe = new JFrame();
      Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Jframe.setBounds(0, 0, 805, 505);
      JPanel contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      Jframe.setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton(" ");
      btnNewButton.setBounds(0, 0, 789, 450);
      contentPane.add(btnNewButton);
      Jframe.setVisible(true);
      
     Subway_stop_or_not Subway_stop_or_not = new Subway_stop_or_not();
      location station = new location(); 
     subway subway_go = new subway();


   while(current < dest){
      stop = Subway_stop_or_not.stop_or_not();
      //If subway is stop then 
      if(stop==1)
      {
         
         //Show that current station image 
         if(i==1){
            next_station = station.find_current_station(1);
            i =i+1;
         }
         subway_go.setVisible(false);      
         btnNewButton.setIcon(new ImageIcon("station"+(next_station)+".PNG"));
               DealyMethod(19);

         next_station=next_station+1;
         current = current + 1;
      }
      
      //If subway is running 
      else if(stop==0) 
      { 
         
         subway subway_go1 = new subway();
            subway_go1.hi();           
            DealyMethod(11);

            
      }
      
      //If station is comming in the destination station 
      else{
          System.out.println("거의 다 도착했다면");
         return -1;
         }
   }
   System.out.println("거의 다 도착했다면");
   return -1;
  }
   
   //DealyMethod
   public void DealyMethod(int delayTime) throws Exception{
      int mdelayTime;
      mdelayTime = delayTime * 1000;
      Robot robot = new Robot();
      robot.delay(mdelayTime);
   }
   
}