import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Property extends JFrame implements ActionListener
{
    public static String OwnerName = "";
    public static String OwnerAddress = "";
    public static double PropertyValue = 0.0;
    public static String LocationCategory = "";
    public static boolean PPResidence = false;

    private JLabel entername, enteraddress, enterpropertyvalue, choosecat, PPRchoose;
    private JRadioButton one, two, three, four, five;
    private JRadioButton yes, no;
    private JButton proceed, cancel;
    private JTextField name, address, marketval;
    
    public Property()
    {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
            
        entername = new JLabel("Please Enter the name of the property owner:");
        entername.setBounds(30, 30, 520, 30);
        add(entername);
        
   /*     event1 e1 = new event1 ();
        one.addActionListener(this);
        
        event2 e2 = new event2 ();
        two.addActionListener(this);
        
        event3 e3 = new event3 ();
        three.addActionListener(this);
        
        event4 e4 = new event4 ();
        four.addActionListener(this);
        
        event5 e5 = new event5 ();
        five.addActionListener(this);
        
        event6 e6 = new event6 ();
        yes.addActionListener(this);
        
        event7 e7 = new event7 ();
        no.addActionListener(this);
    */    
            
        name = new JTextField();                   
        name.setBounds(30, 60, 520, 30);
        add(name);
        name.addActionListener(this);
            
        enteraddress = new JLabel("Please Enter the address of the property:");
        enteraddress.setBounds(30, 100, 520, 30);
        add(enteraddress);
        address = new JTextField();
        address.setBounds(30, 130, 520, 30);
        add(address);
        address.addActionListener(this);
            
        enterpropertyvalue = new JLabel("Please Enter the estimated market value of the property:");
        enterpropertyvalue.setBounds(30, 170, 520, 30);
        add(enterpropertyvalue);
        marketval = new JTextField();
        marketval.setBounds(30, 200, 520, 30);
        add(marketval);
        marketval.addActionListener(this);
            
        PPRchoose = new JLabel("Is this property a Principal Private Residence?");
        PPRchoose.setBounds(30, 310, 520, 30);
        add(PPRchoose);
            
        choosecat = new JLabel("Please choose one of the location categories that best suits your property.");
        choosecat.setBounds(30, 240, 520, 30);
        add(choosecat);
            
        one = new JRadioButton("City.");
        one.setBounds(30, 270, 50, 30);
        add(one);
        one.addActionListener(this);
        
        two = new JRadioButton("Large Town.");
        two.setBounds(85, 270, 100, 30);
        add(two);
        two.addActionListener(this);
        
        three = new JRadioButton("Small Town.");
        three.setBounds(186, 270, 100, 30);
        add(three);
        three.addActionListener(this);
        
        four = new JRadioButton("Village.");
        four.setBounds(286, 270, 70, 30);
        add(four);
        four.addActionListener(this);
        
        five = new JRadioButton("Countryside.");
        five.setBounds(360, 270, 100, 30);
        add(five);
        five.addActionListener(this);
            
        
        yes = new JRadioButton("Yes.");
        yes.setBounds(30, 340, 50, 30);
        add(yes);
        yes.addActionListener(this);
        no = new JRadioButton("No.");
        no.setBounds(85, 340, 80, 30);
        add(no);
        yes.addActionListener(this);
            
        
        ButtonGroup group = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();
        group.add(one);
        group.add(two);
        group.add(three);
        group.add(four);
        group.add(five);
        
        group2.add(yes);
        group2.add(no);
            
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);

        proceed = new JButton("Okay");
        proceed.setBounds(30, 520, 100, 30);
        add(proceed);
        proceed.addActionListener(this);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(170, 520, 100, 30);
        add(cancel);
        cancel.addActionListener(this);
            
    }
    
    public Property (String OwnerName, String OwnerAddress, double PropertyValue, String LocationCategory, boolean PPResidence)
    {
        this.OwnerName = OwnerName; //official
        this.OwnerAddress = OwnerAddress; //official
        this.PropertyValue = PropertyValue; //official
        this.LocationCategory = LocationCategory; //official
        this.PPResidence = PPResidence; //official
    }
    
    public String getOwnerName()
    {
        return OwnerName;
    }
    
    public void setOwnerName(String OwnerName)
    {
        this.OwnerName = OwnerName;
    }
    
    public String getOwnerAddress()
    {
        return OwnerAddress;
    }
    
    public void setOwnerAddress(String OwnerAddress)
    {
        this.OwnerAddress = OwnerAddress;
    }

    public double getPropertyValue()
    {
        return PropertyValue;
    }
    
    public void setPropertyValue(double PropertyValue)
    {
        this.PropertyValue = PropertyValue;
    }
    
    public String getLocationCategory()
    {
        return LocationCategory;
    }
    
    public void setLocationCategory(String LocationValue)
    {
        this.LocationCategory = LocationCategory;
    }
    
    public boolean getPPResidence()
    {
        return PPResidence;
    }
    
    public void setPPResidence(boolean PPResidence)
    {
        this.PPResidence = PPResidence;
    }
    
  
    
  /*  public class event1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e1)
    	{
    		if(e1.getSource() == one)
			{
				LocationCategory = "City";
			}
    	}
    }
    
    public class event2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e2)
    	{
    		if(e2.getSource() == two)
			{
				LocationCategory = "Large Town";
			}
    	}
    }
    
    public class event3 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e3)
    	{
    		if(e3.getSource() == three)
			{
				LocationCategory = "Small Town";
			}
    	}
    }
    
    public class event4 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e4)
    	{
    		if(e4.getSource() == four)
			{
				LocationCategory = "Village";
			}
    	}
    }
    
    public class event5 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e5)
    	{
    		if(e5.getSource() == five)
			{
				LocationCategory = "Countryside";
			}
    	}
    }
    
    public class event6 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e6)
    	{
    		if(e6.getSource() == yes)
			{
    			PPResidence = true;
			}
    	}
    }
    
    public class event7 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e7)
    	{
    		if(e7.getSource() == no)
			{
    			PPResidence = false;
			}
    	}
    }
   
    */
    
    public void actionPerformed(ActionEvent e)
	{
		
    	this.OwnerName = name.getText();
		this.OwnerAddress = address.getText();
		String MarketV = marketval.getText();
		this.PropertyValue = Double.parseDouble(MarketV);
    	
    	if(e.getSource() == proceed)
		{	
			PropertyTaxStatistics PTS1 = new PropertyTaxStatistics();
		}
		
		if(e.getSource() == cancel)
		{
			System.exit(EXIT_ON_CLOSE);;
		}	
		
		if(e.getSource() == one)
		{
			this.LocationCategory = "City";
		}

		if(e.getSource() == two)
		{
			this.LocationCategory = "Large Town";
		}
	
		if(e.getSource() == three)
		{
			this.LocationCategory = "Small Town";
		}

		if(e.getSource() == four)
		{
			this.LocationCategory = "Village";
		}

		if(e.getSource() == five)
		{
			this.LocationCategory = "Countryside";
		}

		if(e.getSource() == yes)
		{
			this.PPResidence = true;
		}
		
		if(e.getSource() == no)
		{
			this.PPResidence = false;
		}
		
		
	} 
    
    
}
    

    

