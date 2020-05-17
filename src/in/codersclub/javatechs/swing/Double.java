/*
     Using annonymous innerclass
*/

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Double extends JFrame
{
	private JButton btnClick;
	private JLabel lblValue;
	
	private int n;
	
	public Double()
	{
	    setLayout(new FlowLayout()); 

		btnClick = new JButton("Click");  
	    lblValue = new JLabel("1");
	    
	    btnClick.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent ae)
		    {
	            String s = lblValue.getText();
	            n = Integer.parseInt(s);
	            n = n * 2;
	            lblValue.setText(""+n);
		    }
	    });

	    // add components
	    add(btnClick);  
	    add(lblValue);

	    setTitle("Double");
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}
	
	public static void main(String args[])
	{
        new Double();
	}
}
	
	







