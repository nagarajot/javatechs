/*
       3 components
       
    txtFirst       txtSecond       txtThird   
*/



package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;

public class ThreeTextFieldsApplet extends Applet
{
	private TextField txtFirst;
	private TextField txtSecond;
	private TextField txtThird;
	
	@Override
	public void init()
	{
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		
		txtFirst = new TextField(4);
		txtSecond = new TextField(8);
		txtThird = new TextField(20);
		
		add(txtFirst);
		add(txtSecond);
		add(txtThird);
		
	}
}


