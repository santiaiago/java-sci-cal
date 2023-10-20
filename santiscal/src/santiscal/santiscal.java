package santiscal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class santiscal {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	double lastAnswer = 0;
	double memory = 0;
	String operation;
	String answer;
	boolean isDegrees = true;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					santiscal window = new santiscal();
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
	public santiscal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 414, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSinminus = new JButton("SIN-1");
		btnSinminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			{			
						double a=Math.asin(Double.parseDouble(textField.getText()));
						textField.setText("");
						textField.setText(textField.getText()+a);
					}
			
			}
		});
		btnSinminus.setBounds(10, 108, 59, 32);
		frame.getContentPane().add(btnSinminus);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
				
				
			}
		});
		btnXy.setBounds(0, 144, 59, 32);
		frame.getContentPane().add(btnXy);
		
		JButton btnYsquarex = new JButton("y√x");
		btnYsquarex.setBounds(10, 180, 59, 32);
		frame.getContentPane().add(btnYsquarex);
		
		JButton btnLeftPar = new JButton("(");
		btnLeftPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "(");
			}
		});
		btnLeftPar.setBounds(10, 217, 45, 32);
		frame.getContentPane().add(btnLeftPar);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(10, 253, 45, 32);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(10, 288, 45, 32);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(10, 324, 45, 32);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(10, 357, 45, 32);
		frame.getContentPane().add(btn0);
		
		JButton btnPlusminus = new JButton("±");
		btnPlusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusminus.setBounds(10, 389, 45, 32);
		frame.getContentPane().add(btnPlusminus);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(65, 253, 45, 32);
		frame.getContentPane().add(btn8);
		
		JButton btnCosminus = new JButton("cos-1");
		btnCosminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.acos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosminus.setBounds(69, 108, 61, 32);
		frame.getContentPane().add(btnCosminus);
		
		JButton btnX3 = new JButton("x^3");
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX3.setBounds(65, 144, 65, 32);
		frame.getContentPane().add(btnX3);
		
		JButton btn3squarex = new JButton(" 3 √x");
		btn3squarex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double value = Double.parseDouble(textField.getText());
		        double result = Math.cbrt(value);
		        textField.setText("" + result);
				
			}
		});
		btn3squarex.setBounds(75, 180, 66, 32);
		frame.getContentPane().add(btn3squarex);
		
		JButton btnRightPar = new JButton(")");
		btnRightPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 textField.setText(textField.getText() + ")");
			}
		});
		btnRightPar.setBounds(65, 217, 45, 32);
		frame.getContentPane().add(btnRightPar);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(65, 288, 45, 32);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2\r\n");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(65, 324, 45, 32);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(65, 357, 45, 32);
		frame.getContentPane().add(btnDot);
		
		JButton btnRnd = new JButton("RND");
		btnRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double randomValue = Math.random();
		        textField.setText("" + randomValue);
			}
		});
		btnRnd.setBounds(57, 389, 59, 32);
		frame.getContentPane().add(btnRnd);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(120, 253, 45, 32);
		frame.getContentPane().add(btn9);
		
		JButton btnTanminus = new JButton("tan-1");
		btnTanminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.atan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanminus.setBounds(134, 108, 59, 32);
		frame.getContentPane().add(btnTanminus);
		
		JButton btnX2 = new JButton("x^2");
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX2.setBounds(130, 144, 59, 32);
		frame.getContentPane().add(btnX2);
		
		JButton btnSquarex = new JButton("√x");
		btnSquarex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquarex.setBounds(151, 180, 53, 32);
		frame.getContentPane().add(btnSquarex);
		
		JButton btnNewButton_3_2 = new JButton("1/x");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnNewButton_3_2.setBounds(120, 217, 51, 32);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(120, 288, 45, 32);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(120, 324, 45, 32);
		frame.getContentPane().add(btn3);
		
		JButton btnExp = new JButton("EXP");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double expValue = Math.E;
		        textField.setText("" + expValue); 
			}
		});
		btnExp.setBounds(120, 357, 51, 32);
		frame.getContentPane().add(btnExp);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnAc.setBounds(120, 389, 51, 32);
		frame.getContentPane().add(btnAc);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setBounds(175, 253, 45, 32);
		frame.getContentPane().add(btnAdd);
		
		JButton btnPi = new JButton("π");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double piValue = Math.PI;
			        textField.setText("" + piValue);
			}
		});
		btnPi.setBounds(203, 108, 45, 32);
		frame.getContentPane().add(btnPi);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnEx.setBounds(195, 144, 59, 32);
		frame.getContentPane().add(btnEx);
		
		JButton btnIn = new JButton("In");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double value = Double.parseDouble(textField.getText());
		        double result = Math.log(value);
		        textField.setText("" + result);
			}
		});
		btnIn.setBounds(209, 180, 45, 32);
		frame.getContentPane().add(btnIn);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setBounds(175, 217, 45, 32);
		frame.getContentPane().add(btnPercent);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setBounds(175, 324, 45, 32);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setBounds(175, 288, 45, 32);
		frame.getContentPane().add(btnMinus);
		
		JButton btnDivide = new JButton("÷");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setBounds(175, 357, 45, 32);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						second=Double.parseDouble(textField.getText());
						if(operation=="+")
						{
							result=first+second;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operation=="-")
						{
							result=first-second;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operation=="*")
						{
							result=first*second;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operation=="/")
						{
							result=first/second;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else 	if(operation=="%")
						{
							result=first%second;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operation=="X^Y")
						{
							double result=1;
							for(int i=0;i<second;i++)
							{	
							result=first*result;
							}
							
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						
							
			}
		});
		btnEqual.setBounds(175, 389, 45, 32);
		frame.getContentPane().add(btnEqual);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Back=null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
							str.deleteCharAt(textField.getText().length()-1);
					Back=str.toString();
					textField.setText(Back);
				}
			}
		});
		btnBack.setBounds(230, 253, 59, 32);
		frame.getContentPane().add(btnBack);
		
		JButton btnE = new JButton("e");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double expValue = Math.E;
		        textField.setText("" + expValue);
			}
		});
		btnE.setBounds(258, 108, 59, 32);
		frame.getContentPane().add(btnE);
		
		JButton btn10x = new JButton("10^x");
		btn10x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double value = Double.parseDouble(textField.getText());
			        double result = Math.pow(10, value);
			        lastAnswer = result;  
			        textField.setText("" + result);
			}
		});
		btn10x.setBounds(258, 144, 59, 32);
		frame.getContentPane().add(btn10x);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double value = Double.parseDouble(textField.getText());
			        double result = Math.log10(value);
			        textField.setText("" + result);
			}
		});
		btnLog.setBounds(266, 180, 51, 32);
		frame.getContentPane().add(btnLog);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
					
			}
		});
		btnN.setBounds(230, 217, 45, 32);
		frame.getContentPane().add(btnN);
		
		JButton btnAns = new JButton("Ans");
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				textField.setText("" + lastAnswer);
			}
		});
		btnAns.setBounds(230, 288, 59, 32);
		frame.getContentPane().add(btnAns);
		
		JButton btnMplus = new JButton("M+");
		btnMplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double value = Double.parseDouble(textField.getText());
			        memory += value;
			}
		});
		btnMplus.setBounds(230, 324, 59, 32);
		frame.getContentPane().add(btnMplus);
		
		JButton btnMminus = new JButton("M-");
		btnMminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double value = Double.parseDouble(textField.getText());
		        memory -= value;
				
			}
		});
		btnMminus.setBounds(230, 357, 59, 32);
		frame.getContentPane().add(btnMminus);
		
		JButton btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("" + memory); 
			}
		});
		btnMr.setBounds(230, 389, 59, 32);
		frame.getContentPane().add(btnMr);
		
		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setBounds(10, 72, 59, 32);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setBounds(75, 72, 55, 32);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setBounds(140, 72, 57, 32);
		frame.getContentPane().add(btnTan);
		
		
		JRadioButton rdbtnDeg = new JRadioButton("DEG");
		rdbtnDeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isDegrees = true;
			}
		});
		buttonGroup.add(rdbtnDeg);
		rdbtnDeg.setBounds(203, 78, 45, 23);
		frame.getContentPane().add(rdbtnDeg);
		
		JRadioButton rdbtnRad = new JRadioButton("RAD");
		rdbtnRad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isDegrees = false;
			}
		});
		rdbtnRad.setBounds(268, 77, 49, 23);
		frame.getContentPane().add(rdbtnRad);
		
		
		
	}
	
	
}
