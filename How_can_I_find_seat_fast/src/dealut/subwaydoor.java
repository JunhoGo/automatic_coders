package dealut;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Show moving subway door
public class subwaydoor extends JFrame{
   
   JLabel pic;
   Timer tm;
   int x=0;
   
   //put the image in the list
   String[] list= {
         "door1.png",
         "door2.png",
         "door3.png",
         "door4.png",
         "door5.png",
         "door6.png",
         "door7.png",
         "door8.png",
         "door9.png",
         "door10.png",
         "door11.png"
         
         
         
   };
   //set timer and play slide show
   public subwaydoor(){
      super("Java slideshow");
      pic = new JLabel();
      pic.setBounds(0, 0, 805, 505);
      
      SetImageSize(10);
      
      tm= new Timer(100,new ActionListener(){
         
         @Override
         public void actionPerformed(ActionEvent e){
            SetImageSize(x);
            x+=1;
            if(x>= list.length)
               x=0;
            
         }
      });
      add(pic);
      tm.start();
      setLayout(null);
      setBounds(0,0,805,505);
      getContentPane().setBackground(Color.decode("#bdb67b"));
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocation(0,0);
      setVisible(true);
   }   
            
            
   
   //set the images size
   public void SetImageSize(int i){
      ImageIcon icon= new ImageIcon(list[i]);
      Image img= icon.getImage();
      Image newImg= img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon newImc= new ImageIcon(newImg);
      pic.setIcon(newImc);
   }
   
   public static void main(String[] args){
      new subwaydoor();
      
   }
}