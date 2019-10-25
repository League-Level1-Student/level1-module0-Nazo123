package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    public void showButton() {
    	JFrame bob = new JFrame();
        System.out.println("Button clicked");
        bob.setVisible(true);
        JButton button = new JButton();
        bob.add(button);
        bob.pack();
        button.addActionListener(this);
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

   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}