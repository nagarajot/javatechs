package in.cdoc.applets;

import java.applet.Applet;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterApplet extends Applet {

    public void init() {
       addKeyListener(new MyKeyAdapter(this));
    }
}

class MyKeyAdapter extends KeyAdapter {

     KeyAdapterApplet keyAdapterApplet;

     public MyKeyAdapter(KeyAdapterApplet keyAdapterApplet) {
         this.keyAdapterApplet = keyAdapterApplet;
     }

     // Handle keyPressed event
     @Override
     public void keyPressed(KeyEvent ke) {
         keyAdapterApplet.showStatus(ke.getKeyChar() + " : Key pressed ...");
         System.out.println(ke.getKeyChar() + " : key pressed");
     }
}

/*
    KeyListener has 3 methods. 
    
    > keyPressed
    > keyReleased
    > keyTyped
    
    We are using the adapter class, and we are giving implementation for 
    only one method, called as keyPressed.
    
    Other two methods will get the default implementation from the Adapter class.
*/




