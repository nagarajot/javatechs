package in.cdoc.applets;

import java.applet.Applet;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseAdapterApplet extends Applet {

    public void init() {
       addMouseListener(new MyMouseAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter {

     MouseAdapterApplet mouseAdapterApplet;

     public MyMouseAdapter(MouseAdapterApplet mouseAdapterApplet) {
         this.mouseAdapterApplet = mouseAdapterApplet;
     }

     // Handle mouseClicked event
     @Override
     public void mouseClicked(MouseEvent me) {
         mouseAdapterApplet.showStatus("Mouse clicked ...");
         System.out.println("mouseClicked ...");
     }
}

/*
    MouseListener has 5 methods. 
    
    > mouseClicked
    > mouseEntered
    > mouseExited
    > mousePressed
    > mouseReleased
    
    We are using the adapter class, and we are giving implementation for 
    only one method, called as mouseClicked.
    
    Other four methods will get the default implementation from the Adapter class.
 */







