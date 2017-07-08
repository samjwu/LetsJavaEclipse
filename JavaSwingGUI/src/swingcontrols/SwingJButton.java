package swingcontrols;

import javax.swing.*;

public class SwingJButton {
	public static void main(String[] args) {
		JFrame javaframe = new JFrame();//create an instance of JFrame  
    
		JButton javabutton = new JButton("Click Here"); //create an instance of JButton  
		javabutton.setBounds(130, 100, 100, 40);//x axis, y axis, width, height  
	          
		javaframe.add(javabutton); //add button to JFrame  
	          
		javaframe.setSize(400,500); //400 width, 500 height  
		javaframe.setLayout(null); //no layout managers  
		javaframe.setVisible(true); //make frame visible  
}
}
