import java.security.SecureRandom;


/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter
{
	private boolean active;
	
	private String intelligenceType;
	
	
	public void setInt(String value)
	{
		intelligenceType = value;
	}
	
	public String getInt()
	{
		return intelligenceType;
	}
	
	public void setActive(boolean value)
	{
		active = value;
	}
	
	public boolean getActive()
	{
		return active;
	}
	
	public NonPlayerCharacter()
	{
		
		super();
		setInt("AVERAGE");
		setActive(false);
		
	}

	
	
	public NonPlayerCharacter(String id, String thePersonality, boolean isActive, String theIntelligenceType)
	{
		super();
		setActive(isActive);
		setInt(theIntelligenceType);
		super.reportStructure();
	}
	
	
	public void Introduce()
	{
		System.out.println("Hello my name is: " +uniqueID);
		
	}
	
	public  String Exclaim()
	{
		
		String E1 = "Dag Gummit";
		String E2 = "Doggone it";
		String E3 = "Holy cow";
		String E4 = "Jeez";
		String E5 = "Well cheese and crackers";
		
		String myStrings[] = {E1, E2, E3, E4, E5};
		SecureRandom rand = new SecureRandom();
		int s = rand.nextInt(5);
		return myStrings[s];
		

	}
	
	/**
	 * Returns the structure of the object in a specially
	 * formatted representation. This is the preferred
	 * method for printing out the object structure.
	 * @return
	 */
	public String reportStructure(){
		
		super.reportStructure();
		
		StringBuilder sb = new StringBuilder(super.reportStructure());
		
		sb.append("isActive: " +getActive()+ "\n");
		
		sb.append("Intelligence Type: " +getInt()+ "\n");
		
		sb.append("==================================\n");
		
		
		return sb.toString();
		
	}//end reportStats
		

}//end class