import java.applet.Applet;  
import java.awt.*;  
 
public class GraphicsDemo3 extends Applet{  
 
public void paint(Graphics g){
g.setColor(Color.black);
int x1Points[] = {300,315,330};
  int y1Points[] = {100,10,100};
 g.fillPolygon(x1Points, y1Points, 3);
g.drawRect(510,200,570,390);  
g.drawArc(730,110,150,150,0,180);
g.drawLine(800,110,800,187);
g.drawLine(730,185,880,185);
g.drawLine(737,155,872,155);
g.drawLine(530,300,680,300);
g.drawLine(900,300,1050,300);
g.drawLine(600,220,600,370);
g.drawLine(980,220,980,370);
g.drawRect(530,220,150,150);  
g.drawRect(900,220,150,150);  
g.drawRect(720,280,150,300);    
 g.fillOval(850, 420, 8, 8);
int x2Points[] = {500,810,1090};
  int y2Points[] = {200,10,200};
 g.drawPolygon(x2Points, y2Points, 3);
g.drawLine(1000,70,1000,140);
g.drawLine(1040,70,1040,165);
g.drawLine(1000,70,1040,70);

Font f= new Font("cambria",20,20);
g.setFont(f);
g.drawString("Babbi",750,250);
}
}