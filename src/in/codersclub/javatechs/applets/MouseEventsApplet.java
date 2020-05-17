package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
MouseListener has 5 methods.

void mouseClicked(MouseEvent e)
void mouseEntered(MouseEvent e)
void mouseExited(MouseEvent e)
void mousePressed(MouseEvent e)
void mouseReleased(MouseEvent e)

MouseMotionListener has 2 methods.

void mouseDragged(MouseEvent e)
void mouseMoved(MouseEvent e)
*/

public class MouseEventsApplet extends Applet
implements MouseListener, MouseMotionListener {
 private String msg = "";
 private int mouseX = 0, mouseY = 0; // coordinates of mouse

 // method override
 public void init() {
  addMouseListener(this);
  addMouseMotionListener(this);
 }

 // method of MouseListener interface
 // Handle mouse clicked.
 public void mouseClicked(MouseEvent me) {
  // save coordinates
  mouseX = 0;
  mouseY = 10;
  msg = "Mouse clicked.";
  repaint();
 }

 // method of MouseListener interface
 // Handle mouse entered.
 public void mouseEntered(MouseEvent me) {
  // save coordinates
  mouseX = 0;
  mouseY = 10;
  msg = "Mouse entered.";
  repaint();
 }
 
 // method of MouseListener interface
 // Handle mouse exited.
 public void mouseExited(MouseEvent me) {
  // save coordinates
  mouseX = 0;
  mouseY = 10;
  msg = "Mouse exited.";
  repaint();
 }

 // method of MouseListener interface
 // Handle button pressed.
 public void mousePressed(MouseEvent me) {
  // save coordinates
  mouseX = me.getX();
  mouseY = me.getY();
  msg = "Down";
  repaint();
 }

 // method of MouseListener interface
 // Handle button released.
 public void mouseReleased(MouseEvent me) {
  // save coordinates
  mouseX = me.getX();
  mouseY = me.getY();
  msg = "Up";
  repaint();
 }

 // method of MouseMotionListener interface
 // Handle mouse dragged.
 public void mouseDragged(MouseEvent me) {
  // save coordinates
  mouseX = me.getX();
  mouseY = me.getY();
  msg = "*";
  showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
  repaint();
 }

 // method of MouseMotionListener interface
 // Handle mouse moved.
 public void mouseMoved(MouseEvent me) {
  // show status
  showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
 }

 // method override
 // Display msg in applet window at current X,Y location.
 public void paint(Graphics g) {
  g.drawString(msg, mouseX, mouseY);
 }
}


