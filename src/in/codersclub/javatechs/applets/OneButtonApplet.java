/*
    1 component
        
    btnSubmit   
*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class OneButtonApplet extends Applet
{
	private Button btnSubmit;
	
	@Override
	public void init()
	{
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		
		btnSubmit = new Button("Submit");
		
		add(btnSubmit);
		
	}
}


