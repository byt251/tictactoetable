import java.awt.Graphics;
import javax.swing.JApplet;
public class tictactoe extends JApplet{
    public void paint (Graphics canvas){
        canvas.drawLine(100,10,100,300);
        canvas.drawLine (200,10,200,300);
        canvas.drawLine (10,100,300,100);
        canvas.drawLine (10,200,300,200);
        canvas.drawOval (30,140,40,40);
        canvas.drawOval (230,140,40,40);
        canvas.drawOval (130,240,40,40);
        canvas.drawOval (230,240,40,40);
        canvas.drawLine (70,30, 30,70);
        canvas.drawLine (30,30,70,70);
        canvas.drawLine (130,30,170,70);
        canvas.drawLine (170,30,130,70);
        canvas.drawLine (230,30,270,70);
        canvas.drawLine (270,30,230,70);
        canvas.drawLine (130,130,170,170);
        canvas.drawLine(170,130,130,170);
        canvas.drawLine (30,230,70,270);
        canvas.drawLine(70,230,30,270);
        canvas.drawLine(20,50,280,50);
    }
}