package jpasswordfield;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.*;

public class EnterUserPass {
	public static void main(String[] args) {
	    JFrame f = new JFrame("Password Field");
	    
	    final JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);
	    
	    final JPasswordField value = new JPasswordField();
	    value.setBounds(100, 75, 100, 30); 
	    
	    JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);
	    
        JButton b = new JButton("Login");
        b.setBounds(100,120, 80,30);
        
        f.add(text);
	    f.add(value);
	    f.add(l1);
	    f.add(l2);
	    f.add(b);
	    f.setSize(300, 300);
	    f.setLayout(null);
	    f.setVisible(true);
		}
}
