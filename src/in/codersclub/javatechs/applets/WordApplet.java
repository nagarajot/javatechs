package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.scene.control.ComboBox;

public class WordApplet extends Applet implements ActionListener
{
	private Label lblNumber;
	private Choice chcNumber;
	private Button btnSubmit;
	private Label lblResult;
	
	@Override
	public void init()
	{
         lblNumber = new Label("Number");
		 chcNumber = new Choice();
		 for ( int i = 0; i < 10; i++ )
			 chcNumber.add(Integer.toString(i));
		 btnSubmit = new Button("Submit");
         lblResult = new Label("");
		 
		 add(lblNumber);
		 add(chcNumber);
		 add(btnSubmit);
	     add(lblResult);
	     
		 btnSubmit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		String strNumber = chcNumber.getSelectedItem();
		int n = Integer.parseInt(strNumber);
	
		System.out.println(n);
		
		String result = "";
		
		switch (n)
		{
		case 0 : 
			result = "Zero";
			break;
		case 1 :
			result = "One";
			break;
		case 2 :
			result = "Two";
			break;
		case 3 :
			result = "Three";
			break;
		case 4 :
			result = "Four";
			break;
		case 5 :
			result = "Five";
			break;
		case 6 :
			result = "Six";
			break;
		case 7 :
			result = "Seven";
			break;
		case 8 :
			result = "Eight";
			break;
		case 9 :
			result = "Nine";
			break;
		}
		
		lblResult.setText(result);
	}
}





