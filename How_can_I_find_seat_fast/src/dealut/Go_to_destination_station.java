package dealut;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Color;

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

//Go to destination station
//Soon arrive 
//So show GUI 
public class Go_to_destination_station extends TCP_echo_client {

   private JPanel contentPane;
   private JFrame Jframe;
   /**
    * Launch the application.
    */

   /**
    * Create the frame.
    */
   public Go_to_destination_station() {
      Jframe = new JFrame();
      Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Jframe.setBounds(0, 0, 805, 505);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      Jframe.setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton(" ");
      btnNewButton.setIcon(new ImageIcon("soon.png"));
      btnNewButton.setBounds(0, 0, 789, 450);
      
      contentPane.add(btnNewButton);
      Jframe.setVisible(true);

   }

}

