/*
 * 
 *     TouchMe1.java - Implements MouseListener
 * 
 */

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TouchMe1 extends JFrame implements MouseListener
{
 private int counter;
 private JButton btnTouchMe;
 private JLabel lblTouchMe;
 
 public  TouchMe1()
 {
  setLayout(new FlowLayout());
  
  counter = 0;
  
  btnTouchMe = new JButton("TouchMe");
  lblTouchMe = new JLabel("" + counter);

  btnTouchMe.addMouseListener(this);

  // Add Components  
  add(btnTouchMe);
  add(lblTouchMe);
 
  setTitle("TouchMe1 - Implements MouseListener");
  setSize(800,600);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }

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
 
 public static void main(String args[])
 {
	 new TouchMe1();
 }
}




