/*
     KeyListener interface 
*/

package in.cdoc.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PressMe1 extends JFrame implements KeyListener
{
 private int counter;
 private JButton btnClickMe;
 private JLabel lblClickMe;
 private String message;
 
 public PressMe1()
 {
  message = "";	  
  setLayout(new FlowLayout());
  
  counter = 0;
  
  btnClickMe = new JButton("ClickMe");
  btnClickMe.addKeyListener(this);
  add(btnClickMe);

  lblClickMe = new JLabel("" + counter);
  add(lblClickMe);
 
  setTitle("ClickMe2 - Innerclass");
  setSize(800,600);
  getContentPane().setBackground(Color.YELLOW);
  setResizable(false);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }

 @Override 
 public void keyTyped(KeyEvent ke)
 {
   message = message + ke.toString();
   lblClickMe.setText(message);
   
 }
 
 @Override
 public void keyPressed(KeyEvent ke)
 {
 }
 
 @Override
 public void keyReleased(KeyEvent ke)
 {
 }
 
 public static void main(String args[])
 {
	 ClickMe1 clickMe = new ClickMe1();
 }
}




