/*
 *   TouchMe4.java - Using inner class, Adapter class
 
 *
 *   MouseListener(5)
 *   MouseMotionListener(2)        MouseAdapter(8)
 *   MouseWheelListener(1)
 *
 *
 */

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TouchMe4 extends JFrame 
{
 private int counter;
 private JButton btnTouchMe;
 private JLabel lblTouchMe;
 
 public  TouchMe4()
 {
  setLayout(new FlowLayout());
  
  counter = 0;
  
  btnTouchMe = new JButton("TouchMe");
  lblTouchMe = new JLabel("" + counter);

  btnTouchMe.addMouseListener(new MyAction());

  // Add components
  add(btnTouchMe);
  add(lblTouchMe);
  
  setTitle("TouchMe4 - Using Innerclass, MouseAdapter");
  setSize(800,500);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }

 class MyAction extends MouseAdapter
 {
	 @Override
	 public void mouseEntered(MouseEvent me)
	 {
	  counter++;
	  lblTouchMe.setText("" + counter);
	 }
 }
 
 public static void main(String args[])
 {
	 new TouchMe4();
 }
}




