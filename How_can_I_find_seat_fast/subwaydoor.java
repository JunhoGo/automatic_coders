
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class subwaydoor extends JFrame{
   JLabel pic;
   Timer tm;
   int x=0;
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
   public subwaydoor(){
      super("Java slideshow");
      pic = new JLabel();
      pic.setBounds(40, 30, 700, 300);
      pic.setBounds(0, 0, 789, 450);
      
      SetImageSize(10);
      
      tm= new Timer(1,new ActionListener(){
         
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
      setSize(805,505);
      getContentPane().setBackground(Color.decode("#bdb67b"));
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }   
 
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