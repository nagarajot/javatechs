/*
            lblNumber  

            btnTriple
*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TripleApplet extends Applet 
{
 private Button btnTriple;
 private Label lblNumber;
 private int counter;
 
 @Override
 public void init()
 {
  counter = 1;
  setLayout(new FlowLayout());
  
  btnTriple = new Button("Triple");
  btnTriple.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent ae)
		 {
			 counter *= 3;
			 lblNumber.setText("" + counter);
		 }
  });
  
  lblNumber = new Label(""+counter);

  add(lblNumber);
  add(btnTriple);
 }
} 




