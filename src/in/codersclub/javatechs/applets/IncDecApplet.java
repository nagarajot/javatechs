/*
          3 components
          
   lblNumber     btnIncrement     btnDecrement

*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncDecApplet extends Applet implements ActionListener
{
 private Button btnIncrement, btnDecrement;
 private Label lblNumber;
 private int counter;
 
 @Override
 public void init()
 {
  counter = 0;
  setLayout(new FlowLayout());
  
  btnIncrement = new Button("Increment");
  btnIncrement.addActionListener(this);

  btnDecrement = new Button("Decrement");
  btnDecrement.addActionListener(this);
  
  lblNumber = new Label(""+counter);
  
  add(lblNumber);
  add(btnIncrement);
  add(btnDecrement);

 }
 
 public void actionPerformed(ActionEvent ae)
 {
	 String command = ae.getActionCommand();
	 
	 if ( command.equals("Increment"))
		 counter++;
	 else
		 counter--;
	 lblNumber.setText("" + counter);
 }
} 




