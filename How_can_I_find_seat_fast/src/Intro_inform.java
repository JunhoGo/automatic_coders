import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro_inform extends Intro_loading {

	private JPanel contentPane;
	JFrame Intro_inform;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("����� main\n");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro_inform frame = new Intro_inform();
					frame.Intro_inform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Intro_inform() {
		System.out.println("����� Intro_inform construct\n");
		      initialize();
	}
	public void initialize(){
		System.out.println("����� initialize\n");

		Intro_inform = new JFrame();//
		Intro_inform.getContentPane().setLayout(null);
		Intro_inform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Intro_inform.setBounds(100, 100, 812, 505);

		Intro_inform.setSize(812,505);
		contentPane = new JPanel();
		Intro_inform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		Intro_inform.setBounds(100, 100, 812, 505);//
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Intro_inform.setContentPane(contentPane);//
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(�ð��� Ȯ������ �� ������ �ӹ��� �ִٸ� ���)
				Intro_enter_current_place intro_enter_current_place = new Intro_enter_current_place();
				//else //�ð��� Ȯ������ �� ������ x���� y�� ���̸� ���� ���̶�� ���
				//Intro_enter_current_place2 intro_enter_current_place2 = new Intro_enter_current_place2();

			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 0, 789, 450);
		btnNewButton.setIcon(new ImageIcon("2�Ұ�.PNG"));
		//contentPane.add(btnNewButton);
	    Intro_inform.getContentPane().add(btnNewButton);

	    this.Intro_inform.setVisible(true);

	}

}
