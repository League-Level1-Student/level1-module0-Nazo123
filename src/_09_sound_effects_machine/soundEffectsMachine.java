package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener{
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button = new JButton();
	public static void main(String[] args) {
		soundEffectsMachine f = new soundEffectsMachine();
		f.bob();
		
	}
	  public  void bob() {
			
			
			JFrame f = new JFrame();
			JPanel p = new JPanel();
			
			
			p.add(button);
			p.add(button1);
			p.add(button2);
			p.add(button3);
			p.add(button4);
		
		f.add(p);
			button.setText("Sound#1");
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.pack();
			button1.setText("Sound#2");
			button2.setText("Sound#3");
			button3.setText("Sound#4");
			
			button.addActionListener(this);
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);

			
	}
	  public void actionPerformed(ActionEvent e) {
		  if (e.getSource()==button) {
				playSound("344272__inspectorj__glass-smash-bottle-e.wav");
		  }
		  else if (e.getSource()==button1) {
			playSound("sawing-wood-daniel_simon.wav");
		  }
		  else if (e.getSource()==button2) {
			  playSound("381353__waveplay-old__120-bpm-basic-drum-loop.wav");
			  }
		  else if (e.getSource()==button3) {
			  playSound("440645__seansecret__opening-door-1.wav");
			  }
		  
		  
			
		}
	  private void playSound(String fileName) {

		    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

		    sound.play();

		}
}
