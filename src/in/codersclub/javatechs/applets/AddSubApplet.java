/*
 label1          textField1
 label2          textField2
   addButton   subButton
         resultLabel 
*/

package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddSubApplet extends Applet implements ActionListener
{
 private Label label1, label2, resultLabel;
 private TextField textField1, textField2;
 private Button addButton, subButton;
 private int opr1, opr2, result;
 private String operand1, operand2;
 
 @Override
 public void init()
 {
  setLayout(new FlowLayout());
  
  label1 = new Label("Operand 1");
  add(label1);
  
  textField1 = new TextField("",4);
  add(textField1);
  
  label2 = new Label("Operand 2");
  add(label2);
  
  textField2 = new TextField("",4);
  add(textField2);
 
  addButton = new Button("Add");
  addButton.addActionListener(this);
  add(addButton);
  
  subButton = new Button("Subtract");
  subButton.addActionListener(this);
  add(subButton);
  
  resultLabel = new Label("");
  add(resultLabel);
 }
 
 public void actionPerformed(ActionEvent ae)
 {
  operand1 = textField1.getText();
  operand2 = textField2.getText();
  
  opr1 = Integer.parseInt(operand1);
  opr2 = Integer.parseInt(operand2);
  
  if ( ae.getSource() == addButton )
   result = opr1 + opr2;
  else
   result = opr1 - opr2;
  
  resultLabel.setText("" + result);
 }
}


