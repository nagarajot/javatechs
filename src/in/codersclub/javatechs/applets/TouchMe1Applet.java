package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TouchMe1Applet extends Applet implements MouseListener
{
	private Button btnTouchMe;
	private int counter;
	private Label lblResult;
	
	public void init()
	{
		btnTouchMe = new Button("TouchMe");
		lblResult = new Label("");
		counter = 0;
		
		add(btnTouchMe);
		add(lblResult);
		
		btnTouchMe.addMouseListener(this);
	}
	
	@Override
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse entered ...");

	    counter++;
	    lblResult.setText("Touched me " + counter + " times");
	
	}
	
	@Override
	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse exited ...");
	}

	@Override
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse pressed ...");
	}

	@Override
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse released ...");
	}

	@Override
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse clicked ...");
	}
}


