package in.cdoc.swing;

import javax.swing.JFrame;

public class Frame3 extends JFrame
{
	public Frame3()
	{
		setTitle("Frame3");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		Frame3 frame = new Frame3();
	}
	
	
	
}