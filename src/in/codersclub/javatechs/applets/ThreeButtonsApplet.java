/*
    3 components
        
    btnFirst        btnSecond      btnThird  
*/

package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class ThreeButtonsApplet extends Applet
{
	private Button btnFirst;
	private Button btnSecond;
	private Button btnThird;
	
	@Override
	public void init()
	{
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		
		btnFirst = new Button("First");
		btnSecond = new Button("Second");
		btnThird = new Button("Third");
		
		add(btnFirst);
		add(btnSecond);
		add(btnThird);
		
	}
}


