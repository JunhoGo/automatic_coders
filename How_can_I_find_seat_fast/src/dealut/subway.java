package dealut;

import java.awt.Color;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class subway extends JFrame{
   JLabel pic;
   Timer tm;
   // JFrame jFrame;
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
            "subway10.png",
            "subway11.png",
            "subway12.png",
            "subway13.png",
            "subway14.png",
            "subway15.png",
            "subway16.png",
            "subway17.png",
            "subway18.png",
            "subway19.png",
            "subway20.png",
            "subway21.png",
            "subway22.png",
            "subway23.png",
            "subway24.png",
            "subway25.png",
            "subway26.png",
            "subway27.png",
            "subway28.png",
            "subway29.png",
            "subway30.png",
            "subway31.png",
            "subway32.png",
            "subway33.png",
            "subway34.png",
            "subway35.png",
            "subway36.png",
            "subway37.png",
            "subway38.png",
            "subway39.png",
            "subway40.png",
            "subway41.png"

   };
   synchronized void hi(){
      //super("Java slideshow");
      setLayout(null);
      setBounds(0, 0, 805, 505);
      pic = new JLabel();
      pic.setBounds(0, 0, 805, 505);// ���������� �ٲ��ذ� 

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
      add(pic);
      tm.start();

      getContentPane().setBackground(Color.decode("#bdb67b"));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      try {
          DealyMethod(1);
       } catch (Exception e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
       } 
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
   public void DealyMethod(int delayTime) throws Exception{
      int mdelayTime;
      mdelayTime = delayTime * 1000;
      Robot robot = new Robot();
      robot.delay(mdelayTime);
   }
}