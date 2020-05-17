package in.cdoc.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample extends JFrame 
{ 
     public FlowLayoutExample() 
     { 
         JButton[] button =new JButton[10]; 
         setLayout(new FlowLayout()); 
         
         for( int i = 0; i < button.length; i++ ) 
         { 
                  button[i]=new JButton("Button "+(i+1)); 
                  add(button[i]); 
         }
         
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         pack();
         setVisible(true);
     } 
     
     public static void main(String args[])
     {
    	 FlowLayoutExample fle = new FlowLayoutExample();
    	 
     }
     
     
} 



