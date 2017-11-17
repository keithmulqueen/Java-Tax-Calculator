import java.util.ArrayList;

public class RegisteredOwners
{
    public static ArrayList RegisteringOwners()
    {
        Property p1 = new Property("Keith Mulqueen","Ballycarney",500000,"Large Town", true);
        
        ArrayList<Object>RegPeople= new ArrayList<Object>();
        RegPeople.add(p1);
        
        
        return RegPeople;
        
    }
 
  
}
