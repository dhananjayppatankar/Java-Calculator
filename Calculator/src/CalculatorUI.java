import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorUI {

	private JFrame frame;
	private JTextField textField;
	private JButton btnbck;
	private JButton btnclr;
	private JButton btnper;
	private JButton btnPM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI window = new CalculatorUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 307, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(12, 13, 267, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/*-------------ROW 1 ------------------------*/			
		
		JButton btnbck;
		btnbck = new JButton("<-");
		btnbck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnbck.setForeground(new Color(0, 0, 0));
		btnbck.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnbck.setBounds(10, 82, 60, 60);
		frame.getContentPane().add(btnbck);
		
		JButton btnclr;
		btnclr = new JButton("C");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnclr.setForeground(Color.BLACK);
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnclr.setBounds(82, 82, 60, 60);
		frame.getContentPane().add(btnclr);
		
		JButton btnper;
		btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnper.setForeground(new Color(0, 0, 0));
		btnper.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnper.setBounds(147, 82, 60, 60);
		frame.getContentPane().add(btnper);
		
		JButton btnPM;
		btnPM = new JButton("+\r\n-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPM.setForeground(Color.BLACK);
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPM.setBounds(219, 82, 60, 60);
		frame.getContentPane().add(btnPM);
		
		
		
	
	/*-------------ROW 2 ------------------------*/	
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(12, 146, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(79, 146, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(147, 146, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btndiv.setForeground(Color.BLACK);
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(219, 146, 60, 60);
		frame.getContentPane().add(btndiv);
		
		
		
/*-------------ROW 3 ------------------------*/	
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 219, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(80, 219, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(147, 219, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnmul= new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnmul.setForeground(Color.BLACK);
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBounds(219, 219, 60, 60);
		frame.getContentPane().add(btnmul);	
		
		
/*-------------ROW 4 ------------------------*/	
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String Enternumber = textField.getText() + btn1.getText();
			textField.setText(Enternumber);
			
				
			}
		});
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(12, 292, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(80, 292, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(147, 292, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnsub= new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnsub.setForeground(Color.BLACK);
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.setBounds(219, 292, 60, 60);
		frame.getContentPane().add(btnsub);			
		
	/*-------------ROW 5 ------------------------*/	
	
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(12, 365, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btndot.setForeground(Color.BLACK);
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(80, 365, 60, 60);
		frame.getContentPane().add(btndot);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnplus.setForeground(new Color(0, 0, 0));
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(147, 365, 60, 60);
		frame.getContentPane().add(btnplus);
		
		JButton btnequal= new JButton("=");
		btnequal.setBackground(Color.ORANGE);
		btnequal.setForeground(Color.BLACK);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnequal.setForeground(Color.BLACK);
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(219, 365, 60, 60);
		frame.getContentPane().add(btnequal);					
		
		
	}
}
