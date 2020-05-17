package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestApplet extends Applet implements ActionListener
{
	private TextField txtPrinciple;
	private TextField txtTerm;
	private TextField txtRateOfInterest;
	
	private Button btnSubmit;
	
	private Label lblResult;
	
	@Override
	public void init()
	{
		setSize(500,400);
		setLayout(new GridBagLayout());
		
		txtPrinciple = new TextField(10);
		txtTerm = new TextField(10);
		txtRateOfInterest = new TextField(10);

		btnSubmit = new Button("Submit");
		
		lblResult = new Label("");
		
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        
        add(new Label("Principle: "),c);
		c.gridy++;
        add(new Label("Term: "),c);
        c.gridy++;
        add(new Label("Rate of Interest: "),c);
        c.gridy++;
		
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.LINE_START;
		
		add(txtPrinciple,c);
		c.gridy++;
		add(txtTerm,c);
		c.gridy++;
		add(txtRateOfInterest,c);

		c.gridy++;
		add(btnSubmit,c);
		
		c.gridy++;
		add(lblResult,c);
	
	    btnSubmit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
         String strPrinciple, strTerm, strRateOfInterest;
         int principle, term, rateOfInterest;
         float simpleInterest;
         
         strPrinciple = txtPrinciple.getText();
         strTerm = txtTerm.getText();
         strRateOfInterest = txtRateOfInterest.getText();
         
         principle = Integer.parseInt(strPrinciple);
         term = Integer.parseInt(strTerm);
         rateOfInterest = Integer.parseInt(strRateOfInterest);
         
         simpleInterest = (principle * term * rateOfInterest) / (float)100.0;
         System.out.println(simpleInterest);
         
         lblResult.setText("" + simpleInterest);
         
	}

	
	
}





