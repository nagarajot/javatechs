/*
 *     TouchMe2.java - Using Inner class
 */

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TouchMe2 extends JFrame 
{
 private int counter;
 private JButton btnTouchMe;
 private JLabel lblTouchMe;
 
 public  TouchMe2()
 {
  setLayout(new FlowLayout());
  
  counter = 0;
  
  btnTouchMe = new JButton("TouchMe");
  lblTouchMe = new JLabel("" + counter);

  btnTouchMe.addMouseListener(new MyAction());

  // Add components
  add(btnTouchMe);
  add(lblTouchMe);
  
  setTitle("TouchMe2 - Using Innerclass");
  setSize(800,500);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }

 // Inner class
 class MyAction implements MouseListener
 {
	 @Override 
	 public void mouseClicked(MouseEvent me)
	 {
	 }
	 
	 @Override
	 public void mousePressed(MouseEvent me)
	 {
	 }
	 
	 @Override
	 public void mouseReleased(MouseEvent me)
	 {
	 }
	 
	 @Override
	 public void mouseEntered(MouseEvent me)
	 {
	  counter++;
	  lblTouchMe.setText("" + counter);
	 }
	 
	 @Override
	 public void mouseExited(MouseEvent me)
	 {
	 }
 }
 
 public static void main(String args[])
 {
	 new TouchMe2();
 }
}




