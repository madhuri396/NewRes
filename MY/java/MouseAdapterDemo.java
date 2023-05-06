import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Applet
{
String str;
public void init()
{
PleaseHelp ph= new PleaseHelp(this);
addMouseListener(ph);
}
public void paint(Graphics g){
g.drawString(str,50,100);
}
class PleaseHelp extends MouseAdapter{
MouseAdapterDemo amad2;
public PleaseHelp(MouseAdapterDemo amad1)
{
amad2=amad1;
}
public void MouseClicked(MouseEvent e)
{
amad2.str="mouse clicked";
amad2.setForeground(Color.red);
amad2.repaint();
}
}
