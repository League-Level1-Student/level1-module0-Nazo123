package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
    public void showButton() {
    	JFrame bob = new JFrame();
    	JPanel e = new JPanel();
        bob.setVisible(true);
        JButton button = new JButton();
        e.add(button);
        bob.add(e);
        bob.pack();
        button.addActionListener(this);
       
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 int rand = new Random().nextInt(5)+1;
	        if (rand==1) {
	        	JOptionPane.showMessageDialog(null, "You will be rich");
	        }
	        else   if (rand==2) {
	        	JOptionPane.showMessageDialog(null, "You will be poor");
	        }

	        else  if (rand==3) {
	        	JOptionPane.showMessageDialog(null, "You will be wealthy");
	        }

	        else  if (rand==4) {
	        	JOptionPane.showMessageDialog(null, "You will be broke");
	        }

	        else    if (rand==5) {
	        	JOptionPane.showMessageDialog(null, "You will be extramyl wealthy");
	        }

		 System.out.println("Button clicked");
		 
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}