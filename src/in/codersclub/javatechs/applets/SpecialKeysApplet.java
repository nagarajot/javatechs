package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpecialKeysApplet extends Applet
implements KeyListener {

  private String msg = "";
  private int x = 10, y = 20; // output coordinates

  // Override
  public void init() {
    addKeyListener(this);
  }

  // method of KeyListener
  public void keyPressed(KeyEvent ke) {
    showStatus("Key Down");
    int key = ke.getKeyCode();
    switch(key) {
      case KeyEvent.VK_F1:
          msg += "<F1>";
          break;
      case KeyEvent.VK_F2:
          msg += "<F2>";
          break;
      case KeyEvent.VK_F3:
          msg += "<F3>";
          break;
      case KeyEvent.VK_PAGE_DOWN:
          msg += "<PgDn>";
          break;
      case KeyEvent.VK_PAGE_UP:
          msg += "<PgUp>";
          break;
      case KeyEvent.VK_LEFT:
          msg += "<Left Arrow>";
          break;
      case KeyEvent.VK_RIGHT:
          msg += "<Right Arrow>";
          break;
    }
    repaint();
  }

  // method of KeyListener
  public void keyReleased(KeyEvent ke) {
    showStatus("Key Up");
  }

  // method of KeyListener interface
  public void keyTyped(KeyEvent ke) {
    msg += ke.getKeyChar();
    repaint();
  }

  // Override
  // Display keystrokes.
  public void paint(Graphics g) {
    g.drawString(msg, x, y);
  }
}





