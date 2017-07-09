package jframe;

import javax.swing.*;

//creating JFrame obj by inheritance
@SuppressWarnings("serial")
public class Inheritance extends JFrame{ //inheriting JFrame  
	JFrame f;
	
	Inheritance(){
		JButton b=new JButton("Click Here"); //create button
		b.setBounds(130, 100, 100, 40);
		add(b); //add jbutton to jframe
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Inheritance();
	}
}