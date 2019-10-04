package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class houses {

	static Robot bob = new Robot();
	public static void main(String[] args) {
		
		
		
		Robot.setWindowSize(500, 500);
		bob.moveTo(10, 490);
		bob.hide();
		bob.setPenWidth(2);
		bob.setSpeed(20);
		bob.setPenColor(0,0,0);
		bob.penDown();
		
		house("large","pointy","red");
		

	
	}
	
	 static public void house(String size,String roof ,String color){
		 int length =0;
		 if(color.equalsIgnoreCase("red")) {
			 bob.setPenColor(255,0,0);
		 }
		 else if (color.equalsIgnoreCase("blue")) {
			 bob.setPenColor(0,0,255);
		 }
		 else if (color.equalsIgnoreCase("green")) {
			 bob.setPenColor(0,255,0);
		 }
		 
		 if(size.equalsIgnoreCase("small")) {
			 length = 50;
		 }
		 else if(size.equalsIgnoreCase("medium")) {
			 length = 100;
		 }
		 else if(size.equalsIgnoreCase("large")) {
			 length = 150;
		 }
	
			bob.move(length);
			bob.turn(90);
			if(roof.equalsIgnoreCase("pointy")) {
			drawPointyRoof();
			}
			else if(roof.equalsIgnoreCase("flat")){
				drawFlatRoof();
			}
			bob.turn(90);
			bob.move(length);
			bob.turn(-90);
			
	 }
	 static public void grass(){
		 
		 bob.setPenColor(0, 255, 0);
			bob.move(30);
			bob.turn(-90);
						
	 }
 static public void drawFlatRoof(){
		 
		bob.move(20);
			
}
 static public void drawPointyRoof(){
	 bob.turn(-45);
		bob.move(14);
		bob.turn(90);
		bob.move(14);
		bob.turn(-45);
			
}
 
}
