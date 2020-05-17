/*
 * TouchMe3.java - Using anonymous inner class
 */

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TouchMe3 extends JFrame 
{
 private int counter;
 private JButton btnTouchMe;
 private JLabel lblTouchMe;
 
 public  TouchMe3()
 {
  setLayout(new FlowLayout());
  
  counter = 0;
  
  btnTouchMe = new JButton("TouchMe");
  lblTouchMe = new JLabel("" + counter);
  
  btnTouchMe.addMouseListener(new MouseListener(){
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
  });

  // Add components
  add(btnTouchMe);
  add(lblTouchMe);

  setTitle("TouchMe2 - Using Anonymous Innerclass");
  setSize(800,500);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }

 public static void main(String args[])
 {
	 new TouchMe3();
 }
}







