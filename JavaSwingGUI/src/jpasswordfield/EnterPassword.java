package jpasswordfield;

import javax.swing.*;

public class EnterPassword {
	public static void main(String[] args) {
    JFrame f = new JFrame("Password Field");
    
    JPasswordField value = new JPasswordField();
    value.setBounds(100, 100, 200, 30); 
    
    JLabel l1 = new JLabel("Password:");
    l1.setBounds(20, 100, 80, 30);
    
    f.add(value);
    f.add(l1);
    f.setSize(400, 300);
    f.setLayout(null);
    f.setVisible(true);
	}
}