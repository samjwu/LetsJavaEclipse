package jtextarea;

import javax.swing.*;
import java.awt.event.*;

//https://www.tutorialspoint.com/java/java_inheritance.htm
//https://stackoverflow.com/questions/4558111/what-does-implements-do-on-a-class
//https://stackoverflow.com/questions/10839131/implements-vs-extends-when-to-use-whats-the-difference

/**
 * 
 * WordCount class: defines/implements methods of ActionListener interface
 * ActionListener interface: interface implemented by WordCount class
 *
 */
public class WordCount implements ActionListener {
	JLabel l1,l2;
	JTextArea area;
	JButton b;
	
	WordCount() {
	    JFrame f = new JFrame();
	    
	    l1 = new JLabel();
	    l1.setBounds(50, 25, 100, 30);
	    l2 = new JLabel();
	    l2.setBounds(160, 25, 100, 30);
	    
	    area = new JTextArea();
	    area.setBounds(20, 75, 250, 200);
	    b = new JButton("Count Words");
	    b.setBounds(100, 300, 120, 30);
	    b.addActionListener(this);
	    
	    f.add(l1);
	    f.add(l2);
	    f.add(area);
	    f.add(b);
	    f.setSize(450, 450);
	    f.setLayout(null);
	    f.setVisible(true);  
	}
	
	//click for word/char count
	public void actionPerformed(ActionEvent e) {
	    String text = area.getText(); //get text from jtextarea
	    String words[] = text.split("\\s"); //split text into words based on spaces
	    l1.setText("Words: " + words.length);
	    l2.setText("Characters: " + text.length());
	}
	
	public static void main(String[] args) {
	    new WordCount();
	}
}