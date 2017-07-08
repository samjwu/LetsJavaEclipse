package jtextfield;

import javax.swing.*;

public class SwingJTextField {
	public static void main(String args[]) {
		JFrame f= new JFrame("JTextField");
		
		JTextField t1,t2;
		
		t1=new JTextField("Java Swing is built on AWT");
		t1.setBounds(50, 100, 200, 30);
		
		t2=new JTextField("Java AWT (Abstract Window Toolkit) is an API to develop GUI or window-based applications in Java");
		t2.setBounds(50, 150, 600, 30);
		
		f.add(t1); f.add(t2);
		f.setSize(800, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}