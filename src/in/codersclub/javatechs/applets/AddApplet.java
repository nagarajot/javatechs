/*
     AddApplet
     6 components - 3 labels, 2 text fileds, 1 button

label1    textField1
label2    textField2
     addButton
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


public class AddApplet extends Applet implements ActionListener
{
 private Label lblOperand1, lblOperand2, lblResult;
 private TextField txtOperand1, txtOperand2;
 private Button btnAdd;
 
 @Override
 public void init()
 {
  setLayout(new FlowLayout());
  
  lblOperand1 = new Label("Operand 1");
  add(lblOperand1);
  
  txtOperand1 = new TextField(4);
  add(txtOperand1);
  
  lblOperand2 = new Label("Operand 2");
  add(lblOperand2);
  
  txtOperand2 = new TextField(4);
  add(txtOperand2);
 
  btnAdd = new Button("Add");
  btnAdd.addActionListener(this);
  add(btnAdd);
  
  lblResult = new Label("");
  add(lblResult);
 }
 
 public void actionPerformed(ActionEvent ae)
 {
	 String operand1, operand2;
	 int a,b;
	 int result;
	 
     operand1 = txtOperand1.getText();
     operand2 = txtOperand2.getText();
  
     a = Integer.parseInt(operand1);
     b = Integer.parseInt(operand2);
  
     result = a + b;
  
     lblResult.setText("" + result);
 }
}




