/*
 * 
 * TouchMe5.java - Using anonymous inner class, Adapter class
 */

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TouchMe5 extends JFrame 
{
 private int counter;
 private JButton btnTouchMe;
 private JLabel lblTouchMe;
 
 public  TouchMe5()
 {
  setLayout(new FlowLayout());
  
  counter = 0;
  
  btnTouchMe = new JButton("TouchMe");
  lblTouchMe = new JLabel("" + counter);

  btnTouchMe.addMouseListener(new MouseAdapter(){
		 @Override
		 public void mouseEntered(MouseEvent me)
		 {
		  counter++;
		  lblTouchMe.setText("" + counter);
		 }
  });

  // Add components
  add(btnTouchMe);
  add(lblTouchMe);
  
  setTitle("TouchMe2 - Using Annonymous Innerclass, MouseAdapter");
  setSize(800,500);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }

 public static void main(String args[])
 {
	 new TouchMe5();
 }
}




