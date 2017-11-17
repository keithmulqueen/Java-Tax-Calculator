import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PropertyTaxStatistics extends JFrame// implements ActionListener
{
    private double FixedValue = 100;

    //public values from System
    private int CountPenaltyYears = PropertyChargeManagementSystem.CountPenaltyYears;
    private static double PenaltyCharge = 0.07;
    
    //public values from Property
    private String OwnerName = Property.OwnerName;
    private String OwnerAddress = Property.OwnerAddress;
    private double PropertyValue = Property.PropertyValue;
    private String LocationCategory = Property.LocationCategory;
    private boolean PPResident = Property.PPResidence;
    
    //new Values
    private double ValueTax = getValueTax();
    private double LocTax = getLocTax();
    private double UnpaidRate = CountPenaltyYears * PenaltyCharge;
    private double UnpaidTax = UnpaidRate*PropertyValue;;
    private double PPResidentCharge = getPPResidentCharge();
    
    private double CalculatedTax = CalculateTax();
    
    //GUI variables
    private JLabel fullOwnerName, fullOwnerAddress, fullPropertyValue, fullPPResidency, fullLocationCategory;
    private JLabel fullFixedValue, fullResidentCharge, fullPenaltyCharge, fullCountPenaltyYears, fullCalculatedTax;
    private JLabel fullValueTax, fullLocTax, correctStats;

    
    public PropertyTaxStatistics()
    {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400,500);
        
        fullOwnerName = new JLabel("Owner Name: " +this.OwnerName );
        fullOwnerName.setBounds(30, 30, 520, 30);
        add(fullOwnerName);
        
        fullOwnerAddress = new JLabel("Owner Address: " +this.OwnerAddress );
        fullOwnerAddress.setBounds(30, 50, 520, 30);
        add(fullOwnerAddress);
        
        fullPropertyValue = new JLabel("Estimated Market Value: €" +this.PropertyValue );
        fullPropertyValue.setBounds(30, 70, 520, 30);
        add(fullPropertyValue);
        
        fullLocationCategory = new JLabel("Location Category: " +this.LocationCategory );
        fullLocationCategory.setBounds(30, 100, 520, 30);
        add(fullLocationCategory);

        fullLocTax = new JLabel("Location Category Tax: " +this.LocTax );
        fullLocTax.setBounds(30, 120, 520, 30);
        add(fullLocTax);
        
        fullCountPenaltyYears = new JLabel("Number of Unpaid Tax Years: " +this.CountPenaltyYears );
        fullCountPenaltyYears.setBounds(30, 150, 520, 30);
        add(fullCountPenaltyYears);
        
        fullPenaltyCharge = new JLabel("Penalty Charge for Unpaid Tax Years: " +this.UnpaidTax );
        fullPenaltyCharge.setBounds(30, 170, 520, 30);
        add(fullPenaltyCharge);
        
        fullFixedValue = new JLabel("Fixed Tax: €" +this.FixedValue );
        fullFixedValue.setBounds(30, 200, 520, 30);
        add(fullFixedValue);

        fullResidentCharge = new JLabel("NON-PP Residency Charge: " +this.PPResidentCharge  );
        fullResidentCharge.setBounds(30, 250, 520, 30);
        add(fullResidentCharge);
        
        fullPPResidency = new JLabel("PP Residency Status: " +this.PPResident );
        fullPPResidency.setBounds(30, 230, 520, 30);
        add(fullPPResidency);

        fullValueTax = new JLabel("Property Value Tax: " +this.ValueTax );
        fullValueTax.setBounds(30, 280, 520, 30);
        add(fullValueTax);

        fullCalculatedTax = new JLabel("Full Calculated Tax: " +this.CalculatedTax );
        fullCalculatedTax.setBounds(30, 320, 520, 30);
        add(fullCalculatedTax);
        
        correctStats = new JLabel("Is this okay?"  );
        correctStats.setBounds(30, 380, 520, 30);
        add(correctStats);
        
    }
    
   /* public PropertyTaxStatistics(double PropertyValue, boolean TaxPaid, boolean PPResident, String LocationCategory)
    { 
        this.PropertyValue=PropertyValue;
        this.TaxPaid=TaxPaid;
        this.PPResident=PPResident;
        this.LocationCategory=LocationCategory;
    } */
  
    public double getValueTax()
    {
        if( PropertyValue <= 150000) // Determining the property value and the suitable tax.
            {
                ValueTax = 0;
            }
            else if ((PropertyValue>150000)&&(PropertyValue<=400000))
            {
                ValueTax = 0.01 * PropertyValue;
            }
            else if ((PropertyValue>400000)&&(PropertyValue<=650000))
            {
                ValueTax = 0.02 * PropertyValue;
            }
            else
            {
                ValueTax = 0.04 * PropertyValue;
            }
            
            return ValueTax;
        }
    
    public void setValueTax(double ValueTax)
    {
        this.ValueTax=ValueTax;
    }
    
     public double getLocTax()
    {
        if( LocationCategory == "City") // Determining the property location and suitable tax.
            {
                LocTax = 100;
            }
            else if (LocationCategory == "Large Town")
            {
                LocTax = 80;
            }
            else if (LocationCategory == "Small Town")
            {
                LocTax = 60;
            }
            else if (LocationCategory == "Village")
            {
                LocTax = 50;
            }
            else if (LocationCategory == "CountrySide")
            {
                LocTax = 25;
            }
            
            return LocTax;
            
        }
    
    public void setLocTax(double LocTax)
    {
        this.LocTax=LocTax;
    }
    
    public boolean getPPResident()
    {
        return PPResident;
    }
    
    public void setPPResident(boolean PPResident)
    {
        this.PPResident=PPResident;
    }
    
    public double getPPResidentCharge()
    {
        
        if(PPResident==true)
        {
            PPResidentCharge = 0;
        }
        else
        {
            PPResidentCharge = 100;
        }
        
        return PPResidentCharge;
    }
    
    public void setPPResidentCharge()
    {
        this.PPResidentCharge=PPResidentCharge;
    }
    
    public double CalculateTax()
    {
        
            this.CalculatedTax = 
                            this.FixedValue// There is always a $100 Fixed Tax regardless of all values.
                            + this.ValueTax // Include the Property Value Tax.
                            + this.LocTax // Include the Location tax.
                            + this.UnpaidTax //added penalty tax accumulated from not paying on time.
                            + this.PPResidentCharge; // Extra tax if not PPResident
           
                            
            
                            
            System.out.println("Property Value (without Tax): " +PropertyValue+ "." );
            System.out.println("Property Value (with Tax)   : " +(PropertyValue+CalculatedTax)+ "." );
            System.out.println("Calculated Tax for Property : " +CalculatedTax+ "." );
            
        
        

        return CalculatedTax;
        
    }
}

    

