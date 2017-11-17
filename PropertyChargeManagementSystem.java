import java.util.Calendar;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PropertyChargeManagementSystem extends JFrame implements ActionListener
{
	private JLabel enterdate, enterdd, entermm, enteryyyy, displayDate;
	private JButton proceed, cancel;
    private JTextField dd, mm, yyyy;
	    
    private static int lastdd;
    private static int lastmm;
    private static int lastyyyy;
    private static int currentdd = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    private static int currentmm = Calendar.getInstance().get(Calendar.MONTH+1);
    private static int currentyyyy = Calendar.getInstance().get(Calendar.YEAR);
    
    public static int CountPenaltyYears = countPenYears();
    
    public PropertyChargeManagementSystem()
    {
        setLayout(null);
        setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(345,300);
	            
        enterdate = new JLabel("Please enter the date of your last Tax Payment:");
        enterdate.setBounds(30, 30, 520, 30);
        add(enterdate);
        
        enterdd = new JLabel("(DD)");
        enterdd.setBounds(30, 60, 30, 30);
        add(enterdd);
	           
        entermm = new JLabel("(MM)");
        entermm.setBounds(90, 60, 50, 30);
        add(entermm);
        
        enteryyyy = new JLabel("(YYYY)");
        enteryyyy.setBounds(150, 60, 60, 30);
        add(enteryyyy);
        
        dd = new JTextField();                   
        dd.setBounds(30, 90, 60, 30);
        add(dd);
        dd.addActionListener(this);
	       
        mm = new JTextField();                   
        mm.setBounds(90, 90, 60, 30);
        add(mm);
        mm.addActionListener(this);
        
        yyyy = new JTextField();                   
        yyyy.setBounds(150, 90, 100, 30);
        add(yyyy);
        yyyy.addActionListener(this);
        
        proceed = new JButton("Okay");
        proceed.setBounds(30, 200, 100, 30);
        add(proceed);
        proceed.addActionListener(this);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(170, 200, 100, 30);
        add(cancel);
        cancel.addActionListener(this);
  
    }
    
    public static void main(String args[])
    {
       PropertyChargeManagementSystem user1 = new PropertyChargeManagementSystem();
        
       
    }
    
    public double ViewPayments(double YearlyPayments[])
    {
        return 1.0;
    }
    
    public void getLastdd(int lastdd)
    {
        this.lastdd = lastdd;
    }
    
    public int setLastdd()
    {
        return lastdd;
    }
    
    public void getLastmm(int lastmm)
    {
        this.lastmm = lastmm;
    }
    
    public int setLastmm()
    {
        return lastmm;
    }
    
    public void getLastyyyy(int lastyyyy)
    {
        this.lastyyyy = lastyyyy;
    }
    
    public int setLastyyyy()
    {
        return lastyyyy;
    }
    
   /* public static int currentDay()
    {
    	currentdd = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    	return currentdd;
    }
 
    public static int currentMonth()
    {
    	currentmm = Calendar.getInstance().get(Calendar.MONTH);
    	return currentmm;
    }
    
    public static int currentYear()
    {
    	currentyyyy = Calendar.getInstance().get(Calendar.YEAR);
    	return currentyyyy;
    }
    */
    public static int countPenYears()
    {
    	CountPenaltyYears = ((currentyyyy - lastyyyy)-1);
    	
    	if(currentmm > lastmm)
    	{
    		CountPenaltyYears++;
    	}
    	else if (currentmm==lastmm)
    	{
    		if(currentdd<=lastdd)
    		{
    			
    		}
    		else
    		{
    			CountPenaltyYears++;
    		}
    	}
    	else
    	{
    		
    	}
    	
    	if(CountPenaltyYears <= -1)
    	{
    		CountPenaltyYears = 0;
    	}
    	
    	return CountPenaltyYears;
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
    	String ddString = dd.getText();
		this.lastdd = Integer.parseInt(ddString);
		
		String mmString = mm.getText();
		this.lastmm = Integer.parseInt(mmString);
		
		String yyyyString = yyyy.getText();
		this.lastyyyy = Integer.parseInt(yyyyString);
		
		String date = ddString + " - " + mmString + " - " + yyyyString;
		
		
		if(e.getSource() == proceed)
		{	
			
			displayDate = new JLabel(date);
	        displayDate.setBounds(30, 120, 120, 30);
	        add(displayDate);
	        
	        User user1 = new User();

		}
		
		if(e.getSource() == cancel)
		{
			System.exit(EXIT_ON_CLOSE);
		}	
		
    } 
        
}
	
