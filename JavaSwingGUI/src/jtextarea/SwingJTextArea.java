package jtextarea;

import javax.swing.*;

public class SwingJTextArea {
	//def obj
	SwingJTextArea() {
		JFrame f= new JFrame();
		
		JTextArea area = new JTextArea("Swing JTextArea");  
        area.setBounds(10, 30, 200, 200);
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
	
	public static void main(String args[]) {
		new SwingJTextArea();
	}
}  
