
public abstract class SportsTeam 
{
	protected String teamName;
	
	protected String teamMascot;
	
	protected String headCoach;
	
	protected int wins;
	
	protected int loses;

	
	public SportsTeam()
	{
		teamName = "";
		
		teamMascot = "";
		
		headCoach = "";
		
		wins = 0;
		
		loses = 0;	
	}
	
	public SportsTeam(String teamName, String teamMascot, String headCoach)
	{
		teamName = "";
		
		teamMascot = "";
		
		headCoach = "";
		
		wins = 0;
		
		loses = 0;	
	}

	public double getWinPercentage(double p) 
	{
		p= wins/(wins+loses);
		return p;
	}
	
	public abstract double[] getStats();

}
