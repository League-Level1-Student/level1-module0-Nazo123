package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String URL = "https://boygeniusreport.files.wordpress.com/2016/11/puppy-dog.jpg?quality=98&strip=all&w=782";
		// 2. create a variable of type "Component" that will hold your image
Component dog;
		// 3. use the"createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
dog = createImage(URL);
quizWindow.add(dog);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("Is this animal not not not not not not not not not not not not not not not not not not not not not a dog?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
	
		// 8. print "INCORRECT" if the answer is wrong
else if(answer.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(dog);
		// 10. find another image and create it (might take more than one line
	URL = "https://timesofindia.indiatimes.com/thumb/msid-67586673,width-800,height-600,resizemode-4/67586673.jpg";
// of code)
dog = createImage(URL);
quizWindow.add(dog);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String an = JOptionPane.showInputDialog("Is this not not a cat");
		// 14+ check answer, say if correct or incorrect, etc.
if(an.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
	else if(an.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "INCORRECT");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
