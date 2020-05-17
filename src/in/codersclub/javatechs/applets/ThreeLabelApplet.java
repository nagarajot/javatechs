/*
      6 components
      
   lblName   txtName    lblAge  txtAge   lblGender  txtGender   
*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

public class ThreeLabelApplet extends Applet
{
	private TextField txtName;
	private TextField txtAge;
	private TextField txtGender;
	
	private Label lblName;
	private Label lblAge;
	private Label lblGender;
	
	@Override
	public void init()
	{
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		
		lblName = new Label("Name : ");
		lblAge = new Label("Age : ");
		lblGender = new Label("Gender : ");
		
		txtName = new TextField(10);
		txtAge = new TextField(4);
		txtGender = new TextField(8);
		
		add(lblName);
		add(txtName);
		
		add(lblAge);
		add(txtAge);
		
		add(lblGender);
		add(txtGender);
	}
}


