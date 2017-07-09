package jpasswordfield;

import javax.swing.*;
import java.awt.event.*;

public class EnterUserPass {
	public static void main(String[] args) {
	    JFrame f = new JFrame("Login Area");
	    
	    //user
	    final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
	    
        //pwd
	    final JPasswordField value = new JPasswordField();
	    value.setBounds(100, 75, 100, 30); 
	    
	    //user/pass labels
	    JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);
	    
        //login button
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);    
        
        //info
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        
        f.add(text);
	    f.add(value);
	    f.add(l1);
	    f.add(l2);
	    f.add(b);
	    f.add(label);
	    f.setSize(300, 300);
	    f.setLayout(null);
	    f.setVisible(true);
	    
	    b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String data = "Username: " + text.getText();
               data += "; Password: " + new String(value.getPassword());
               label.setText(data);
            }
        });
	}
}