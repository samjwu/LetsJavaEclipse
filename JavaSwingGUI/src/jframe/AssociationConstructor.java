package jframe;

import javax.swing.*;

//creating the JFrame obj in the java constructor
public class AssociationConstructor {  
	JFrame f;

	//define AssociationConstructor object
	AssociationConstructor(){
		f = new JFrame(); //creating instance of JFrame
        
		JButton b = new JButton("Click Here"); //creating instance of JButton
		b.setBounds(130, 100, 100, 40);
        
		f.add(b); //adding button in JFrame 
          
		f.setSize(400,500); //400 width, 500 height
		f.setLayout(null); //no layout managers
		f.setVisible(true); //make the frame visible
	}

	public static void main(String[] args) {
		new AssociationConstructor();
	}
}