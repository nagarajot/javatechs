package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

public class ResumeApplet extends Applet
{
	private Label lblName, lblQln, lblLanguages;
	private TextField txtName;
	private Checkbox cbxEnglish, cbxHindi, cbxGerman;
	private List lstQln;
	private Button btnSubmit;

	
	@Override
	public void init()
	{
		// Create components
		
		lblName = new Label("Name : ");
		lblQln = new Label("Qualification : ");
		lblLanguages = new Label("Languages : ");
		
		txtName = new TextField(20);
		
		cbxEnglish = new Checkbox("English");
		cbxHindi = new Checkbox("Hindi");
		cbxGerman = new Checkbox("German");
		
		lstQln = new List();
		lstQln.add("BE-CS");
		lstQln.add("BE-EC");
		lstQln.add("BE-IS");

		btnSubmit = new Button("Submit");
		
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		
		add(lblName);
		add(txtName);
		
		add(lblQln);
		add(lstQln);
		
		add(lblLanguages);
		add(cbxEnglish);
		add(cbxHindi);
		add(cbxGerman);

		add(btnSubmit);
	}
}





