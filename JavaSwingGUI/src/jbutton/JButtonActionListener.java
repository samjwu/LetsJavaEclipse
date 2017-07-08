package jbutton;

import java.awt.event.*;
import javax.swing.*;


public class JButtonActionListener {
	public static void main(String[] args) {
		JFrame f = new JFrame("JButton ActionListener"); //jframe
		
		final JTextField tf = new JTextField(); //jtextfield
		tf.setBounds(50, 50, 150, 20); //x, y, width, height
		
		JButton b = new JButton("Click Here");
		b.setBounds(50, 100, 95, 30);
		//function to set jtextfield if jbutton is pressed
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setText("ActionListener Activated");
			}  
		});
		
		f.add(b); //add jbutton to jframe
		f.add(tf); //add jtextfield to jframe
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true); 
	}
}