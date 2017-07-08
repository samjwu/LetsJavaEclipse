package frames;

import javax.swing.*;

//creating the JFrame obj in the main method
public class AssociationMain {
	public static void main(String[] args) {
		JFrame javaframe = new JFrame();//create an instance of JFrame  
    
		JButton javabutton = new JButton("Click Here"); //create an instance of JButton  
		javabutton.setBounds(130, 100, 100, 40); //x axis, y axis, width, height  
	          
		javaframe.add(javabutton); //add button to JFrame  
	          
		javaframe.setSize(400,500); //400 width, 500 height  
		javaframe.setLayout(null); //no layout managers  
		javaframe.setVisible(true); //make frame visible  
	}
}
