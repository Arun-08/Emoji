package toy;
import java.awt.*;
import java.applet.Applet;
@SuppressWarnings("deprecation")
public class face extends Applet
{
public void paint(Graphics g)
{
	g.drawOval(40, 40, 120, 150); 		 	//head
	g.drawOval(57, 75, 30, 20);   		 	//LeftEye
	g.drawOval(110, 75, 30, 20);  		 	//RightEye
	g.fillOval(68, 81, 10, 10);   		 	//pupil(left)
	g.fillOval(121, 81, 10, 10);  	 	 	// pupil(right)
	g.drawOval(85, 100, 30, 30);  		    //Nose
	g.fillArc(60, 125, 80, 40, 180, 180);   //Mouth
	g.drawOval(25, 92,15, 30);    			//Left ear
	g.drawOval(160, 92, 15, 30);  			//Right ear
}
}
