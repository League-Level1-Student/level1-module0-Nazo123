package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {

	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		cutenessTV a = new cutenessTV();
		a.bob();
	}
	void bob() {
	
	p.add(button);
	
	p.add(button1);
	
	p.add(button2);
	
	

f.add(p);
	button.setText("Duck");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.pack();
	button1.setText("Frog");
	button2.setText("FluffyUnicorns");

	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		  if (e.getSource()==button) {
				showDucks();
		  }
		  else if (e.getSource()==button1) {
			showFrog();
		  }
		  else if (e.getSource()==button2) {
			showFluffyUnicorns();
			  }
		
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
