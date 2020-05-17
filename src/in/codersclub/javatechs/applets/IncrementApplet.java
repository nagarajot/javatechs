/*
            lblNumber  
*
*           btnIncrement
*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncrementApplet extends Applet implements ActionListener
{
 private Button btnIncrement;
 private Label lblNumber;
 private int counter;
 
 @Override
 public void init()
 {
  counter = 0;
  setLayout(new FlowLayout());
  
  btnIncrement = new Button("Increment");
  btnIncrement.addActionListener(this);
  
  lblNumber = new Label(""+counter);

  add(lblNumber);
  add(btnIncrement);
 }
 
 public void actionPerformed(ActionEvent ae)
 {
	 counter++;
	 lblNumber.setText("" + counter);
 }
} 




