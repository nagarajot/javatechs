package in.cdoc.applets;

import java.applet.Applet;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapterApplet extends Applet {

    public void init() {
       addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {

     MouseMotionAdapterApplet mouseMotionAdapterApplet;

     public MyMouseMotionAdapter(MouseMotionAdapterApplet mouseMotionAdapterApplet) {
         this.mouseMotionAdapterApplet = mouseMotionAdapterApplet;
     }

     // Handle mouseClicked event
     @Override
     public void mouseDragged(MouseEvent me) {
         mouseMotionAdapterApplet.showStatus("Mouse dragged ...");
         System.out.println("mouse Dragged ...");
     }
}

/*
    MouseMotionListener has 2 methods. 
    
    > mouseDragged
    > mouseMoved
    
    
    We are using the adapter class, and we are giving implementation for 
    only one method, called as mouseDragged.
    
    Other four methods will get the default implementation from the Adapter class.
 */







