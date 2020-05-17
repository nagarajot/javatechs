package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKeyApplet extends Applet implements KeyListener {
 private String msg = "";
 private int x = 10, y = 20; // output coordinates

 // Overriding
 public void init() {
  addKeyListener(this);
 }

 // interface implementation
 public void keyPressed(KeyEvent ke) {
  showStatus("Key Down");
 }

 // interface implementation
 public void keyReleased(KeyEvent ke) {
  showStatus("Key Up");
 }

 // interface implementation
 public void keyTyped(KeyEvent ke) {
  msg += ke.getKeyChar();
  repaint();
 }
 
 // Overriding
 // Display keystrokes.
 public void paint(Graphics g) {
  g.drawString(msg, x, y);
 }
}


