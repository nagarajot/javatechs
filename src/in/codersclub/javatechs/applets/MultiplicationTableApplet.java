package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTableApplet extends Applet implements ActionListener
{
	private Label lblNumber;
	private TextField txtNumber;
	private Button btnSubmit;
	private TextArea txtaResult;
	
	@Override
	public void init()
	{
		setSize(600,500);
		lblNumber = new Label("Number");
		txtNumber = new TextField(5);
		btnSubmit = new Button("Submit");
		txtaResult = new TextArea();
		
		add(lblNumber);
		add(txtNumber);
		add(btnSubmit);
	    add(txtaResult);

	    btnSubmit.addActionListener(this);
	    
	    txtaResult.setSize(40,80);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		int n;
		String strNumber = txtNumber.getText();
		n = Integer.parseInt(strNumber);
		
		String temp = "";
		
		for ( int i = 1; i <= 10; i++ )
			temp = temp + n + " * " + i  + " = " + n * i + "\n";
		
		txtaResult.setText(temp);
	}
}







