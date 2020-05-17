package in.cdoc.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 
 
public class IncomeTax extends JFrame implements ActionListener
{
	 private JLabel label,label1;
	 private JTextField txt,txt1,txtage;
	 private JButton btn1,btn2;
	 private JLabel lblGender,lblage;
	 private JRadioButton rbtnMale;
	 private JRadioButton rbtnFemale;
	 private JButton btnSubmit;
	 private JLabel lblResult;
	 
	 private ButtonGroup buttonGroup;
		
	 private JCheckBox seniorButton;
   
   public IncomeTax() 
   {
     	super("IncomeTax");
   		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		setLayout(new FlowLayout());
   		
   	 IncomeTax [] emp= new IncomeTax[20];
 	
     FlowLayout flow= new FlowLayout();
     
     JComboBox cboCode=new JComboBox();
     
     lblGender = new JLabel("gender");
     
     rbtnMale = new JRadioButton("male");
     
     rbtnFemale = new JRadioButton("Female");
     
     seniorButton = new JCheckBox("Senior citizen");
     
     lblage = new JLabel("Enter age");
     txtage= new JTextField(10);
     
     label=new JLabel("Enter Income  :");
     txt=new JTextField(10);
     
     btnSubmit = new JButton("submit");
   		
     label1=new JLabel("Income Tax");
     txt1=new JTextField(10);
     
     buttonGroup = new ButtonGroup();
		
		buttonGroup.add(rbtnMale);
		buttonGroup.add(rbtnFemale);
     
		add(lblGender);
   		
   		add(rbtnMale);
   	    add(rbtnFemale);
   	    
   	    add(seniorButton);
   	    
   	    add(lblage);
		add(txtage);
		
		add(btnSubmit);
		
		add(label);
	    add(txt);
	    
	    add(btnSubmit);
	    
	    add(label1);
	    add(txt1);
   		
   		btnSubmit.addActionListener(this);
   }
		
       public void actionPerformed(ActionEvent event)
       {
    	   double a=Integer.parseInt(txt.getText());
           double tax=0,b=0;
           String tax1;
           String tax2;
           String age1;
           String result;
           
         
   		   int age = Integer.parseInt(txtage.getText());
   		   
           tax1 = rbtnMale.getText();
           tax2 = rbtnFemale.getText();
           
       if(age<60)
       {
    	   if(rbtnMale.isSelected())
    	   {
    		   
               if(a>0 && a<=200000)
               { //Change the Income here
                   txt1.setText("0");
               }
               
               else if(a>200000 && a<=300000)
               	{ //Change the Income here
                   a=a-200000;
                   tax=0.1*a; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                   
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               else if(a>300000 && a<=500000)
               { //Change the Income here
                   a=a-300000;
                   tax=0.2*a+14000; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                  
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               else if(a>500000)
               { //Change the Income here
                   a=a-500000;
                   tax=0.3*a+54000; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                  
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
              result=rbtnMale.getText(); 
    	   }
    	   else if(rbtnFemale.isSelected())
             {
    		   
               if(a>0 && a<=200000)
               { //Change the Income here
                   txt1.setText("0");
               }
               
               else if(a>200000 && a<=300000)
               	{ //Change the Income here
                   a=a-200000;
                   tax=0.1*a; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                   
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               else if(a>300000 && a<=500000)
               { //Change the Income here
                   a=a-300000;
                   tax=0.2*a+12000; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                  
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               else if(a>500000)
               { //Change the Income here
                   a=a-500000;
                   tax=0.3*a+51000; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                  
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               result=rbtnFemale.getText();
    	   }
       }
       
      else if(seniorButton.isSelected() && age>=60 )
      {
   	   if(rbtnMale.isSelected())
   	   {
              if(a>0 && a<=200000)
              { //Change the Income here
                  txt1.setText("0");
              }
              
              else if(a>200000 && a<=300000)
              	{ //Change the Income here
                  a=a-200000;
                  tax=0.1*(a/2); //Change the rate % here
                  txt1.setText(String.valueOf(tax));
                  
                  tax+=tax*.03;
                  txt1.setText(String.valueOf(tax));
              }
              else if(a>300000 && a<=500000)
              { //Change the Income here
                  a=a-300000;
                  tax=0.2*a+11000; 
                  txt1.setText(String.valueOf(tax));
                 
                  tax+=tax*.03;
                  txt1.setText(String.valueOf(tax));
              }
              else if(a>500000)
              { //Change the Income here
                  a=a-500000;
                  tax=0.3*a+50000; 
                  txt1.setText(String.valueOf(tax));
                 
                  tax+=tax*.03;
                  txt1.setText(String.valueOf(tax));
              }
              result=rbtnMale.getText(); 
    	   }
       
       else if(rbtnFemale.isSelected())
    	   {
    		   
               if(a>0 && a<=200000)
               { //Change the Income here
                   txt1.setText("0");
               }
               
               else if(a>200000 && a<=300000)
               	{ //Change the Income here
                   a=a-200000;
                   tax=0.1*a; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                   
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               else if(a>300000 && a<=500000)
               { //Change the Income here
                   a=a-300000;
                   tax=0.2*a+10000; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                  
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               else if(a>500000)
               { //Change the Income here
                   a=a-500000;
                   tax=0.3*a+49000; //Change the rate % here
                   txt1.setText(String.valueOf(tax));
                  
                   tax+=tax*.03;
                   txt1.setText(String.valueOf(tax));
               }
               result=rbtnFemale.getText();
    	   }
      	}
      }
       
       public static void main (String[] args) 
       {
		 	IncomeTax Myframe= new IncomeTax();
		    Myframe.setSize(1000,500);
		    Myframe.setVisible(true);
     	 }
}


