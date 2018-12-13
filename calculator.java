package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class calculator implements ActionListener {

	JFrame frame=new JFrame();
	JButton button=new JButton();
	JPanel panel=new JPanel();
	JTextArea textarea=new JTextArea(2,10);

	
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button0=new JButton();
	
	JButton buttonadd=new JButton();
	JButton buttonsub=new JButton();
	JButton buttonmul=new JButton();
	JButton buttondiv=new JButton();
	JButton buttonclear=new JButton();
	JButton buttondot=new JButton();
	JButton buttonequal=new JButton();
	
	static double a=0,b=0,result=0,c=0;
    static int operator=0;

	public calculator()
	{	

        
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("GUI Calculator");
		frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border=BorderFactory.createLineBorder(Color.RED, 4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.BLACK);
		Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font=new Font("aerial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button1.jpeg"));
		

		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button2.jpeg"));
		

		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button3.jpeg"));
		

		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button4.jpeg"));
		

		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button5.jpeg"));
		

		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button6.jpeg"));
		

		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button7.jpeg"));
		

		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button8.jpeg"));
		

		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button9.jpeg"));
		

		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/button0.jpeg"));
		

		buttondot.setPreferredSize(new Dimension(100,40));
		buttondot.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttondot.jpeg"));
		

		buttonclear.setPreferredSize(new Dimension(100,40));
		buttonclear.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttonclear.jpeg"));
		

		buttonequal.setPreferredSize(new Dimension(100,40));
		buttonequal.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttonequal.jpeg"));
		

		buttonadd.setPreferredSize(new Dimension(100,40));
		buttonadd.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttonadd.jpeg"));
		

		buttonsub.setPreferredSize(new Dimension(100,40));
		buttonsub.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttonsub.jpeg"));
		

		buttonmul.setPreferredSize(new Dimension(100,40));
		buttonmul.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttonmul.jpeg"));
		

		buttondiv.setPreferredSize(new Dimension(100,40));
		buttondiv.setIcon(new ImageIcon("/home/aruba/eclipse-workspace/Calculator Project/images/buttondiv.jpeg"));
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttondot);
		panel.add(buttonclear);
		panel.add(buttonequal);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
	
		
		}
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
            textarea.setText(textarea.getText().concat("1"));
        
        if(e.getSource()==button2)
            textarea.setText(textarea.getText().concat("2"));
        
        if(e.getSource()==button3)
            textarea.setText(textarea.getText().concat("3"));
        
        if(e.getSource()==button4)
            textarea.setText(textarea.getText().concat("4"));
        
        if(e.getSource()==button5)
            textarea.setText(textarea.getText().concat("5"));
        
        if(e.getSource()==button6)
            textarea.setText(textarea.getText().concat("6"));
        
        if(e.getSource()==button7)
            textarea.setText(textarea.getText().concat("7"));
        
        if(e.getSource()==button8)
            textarea.setText(textarea.getText().concat("8"));
        
        if(e.getSource()==button9)
            textarea.setText(textarea.getText().concat("9"));
        
        if(e.getSource()==button0)
            textarea.setText(textarea.getText().concat("0"));
        
        if(e.getSource()==buttondot)
            textarea.setText(textarea.getText().concat("."));
        
       
		if(e.getSource()==buttonadd)
        {	
			a=Double.parseDouble(textarea.getText());
            operator=1;
            textarea.setText("+");
        } 
        
        if(e.getSource()==buttonsub)
        {
            a=Double.parseDouble(textarea.getText());
            operator=2;
            textarea.setText("-");
        }
        
        if(e.getSource()==buttonmul)
        {
            a=Double.parseDouble(textarea.getText());
            operator=3;
            textarea.setText("");
        }
        
        if(e.getSource()==buttondiv)
        {
            a=Double.parseDouble(textarea.getText());
            operator=4;
            textarea.setText("/");
        }
        
        if(e.getSource()==buttonequal)
        {
            double b = Double.parseDouble(textarea.getText());
        
            double result;
			switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-(-b);
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            textarea.setText(""+result);
        }
        
        if(e.getSource()==buttonclear)
            textarea.setText("");
        
       /* if(e.getSource()==bdel)
        {
            String s=textarea.getText();
            textarea.setText("");
            for(int i=0;i<s.length()-1;i++)
            textarea.setText(textarea.getText()+s.charAt(i));
        }    */    
}
}
