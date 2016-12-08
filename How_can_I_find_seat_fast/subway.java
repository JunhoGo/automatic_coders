
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class subway extends JFrame{
   JLabel pic;
   Timer tm;
   JFrame jFrame;
   int x=0;
   String[] list= {
         "subway1.png",
         "subway2.png",
         "subway3.png",
         "subway4.png",
         "subway5.png",
         "subway6.png",
         "subway7.png",
         "subway8.png",
         "subway9.png",
         "subway10.png"
      
         
         
         
   };
   public subway(){
	  super("Java slideshow");
      pic = new JLabel();
      pic.setBounds(0, 0, 789, 450);
      
      SetImageSize(9);
      
      tm= new Timer(1,new ActionListener(){
         
         @Override
         public void actionPerformed(ActionEvent e){
            SetImageSize(x);
            x+=1;
            if(x>= list.length)
               x=0;
            
         }
      });
      jFrame.add(pic);
      tm.start();
      jFrame.setLayout(null);
      jFrame.setSize(805,505);//		Jframe.setBounds(100, 100, 805, 505);

      jFrame.getContentPane().setBackground(Color.decode("#bdb67b"));
      jFrame.setLocationRelativeTo(null);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jFrame.setVisible(true);
   }   
  
   public void SetImageSize(int i){
      ImageIcon icon= new ImageIcon(list[i]);
      Image img= icon.getImage();
      Image newImg= img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon newImc= new ImageIcon(newImg);
      pic.setIcon(newImc);
   }
   
  public static void main(String[] args){
	  new subway();
      
   }
}


