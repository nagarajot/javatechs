/*
            lblNumber  

           btnDouble
*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoubleApplet extends Applet 
{
 private Button btnDouble;
 private Label lblNumber;
 private int counter;
 
 @Override
 public void init()
 {
  counter = 1;
  setLayout(new FlowLayout());
  
  btnDouble = new Button("Double");
  btnDouble.addActionListener(new MyDouble());
  
  lblNumber = new Label(""+counter);

  add(lblNumber);
  add(btnDouble);
 }
 
 class MyDouble implements ActionListener
 {
	 public void actionPerformed(ActionEvent ae)
	 {
		 counter *= 2;
		 lblNumber.setText("" + counter);
	 }
	 
 }
} 




