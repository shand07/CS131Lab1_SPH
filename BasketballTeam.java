
public class BasketballTeam extends SportsTeam
{
	/**
	 * Our primitive data types for our BasketballTeam class which extends 
	 * SportsTeam. Here we have all our variables created, set to private,
	 * but not initialized.
	 */
	
	private int fieldGoals;
	
	private int fieldGoalsAttempted;
	
	private int freeThrows;
	
	private int freeThrowsAttempted;
	
	/**
	 * The default and preferred constructors for the BasketballTeam class.
	 * In the default we have not only our primitive data types from the
	 * BasketballTeam class set to zero, but we also have our Strings
	 * from the SportsTeam class which BasketballTeam extends from set to
	 * blank. Our preferred constructor allows us to change the value of any
	 * of our data types to whatever string or integer value we want.
	 */
	public BasketballTeam()
	{
		teamName = "";
		
		teamMascot = "";
		
		headCoach = "";
		
		fieldGoals = 0;
		
		fieldGoalsAttempted = 0;
		
		freeThrows = 0;
		
		freeThrowsAttempted = 0;
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach)
	{
		this.teamName = teamName = "";
		
		this.teamMascot = teamMascot = "";
		
		this.headCoach = headCoach = "";
		
		fieldGoals = 0;
		
		fieldGoalsAttempted = 0;
		
		freeThrows = 0;
		
		freeThrowsAttempted = 0;
		
		
	}
	
	/**
	 * Here the fieldGoalPercentage method takes our values set for fieldGoals
	 * and fieldGoalsAttempted and calculates them into a percent of made goals.
	 * The freeThrowPercentage method does the same thing except with free
	 * throws. Both values are returned.
	 * @param fieldP
	 * @return
	 */
	
	public double fieldGoalPercentage(double fieldP)
	{
		fieldP = fieldGoals/fieldGoalsAttempted;
		return fieldP;
	}
	
	public double  freeThrowPercentage(double freeP)
	{
		freeP = freeThrows/freeThrowsAttempted;
		return freeP;
	}
	
	/**
	 * Our getter and setter methods for all of our stats created within our
	 * BasketballBall class and SportsTeam class. Note that our string variables
	 * are not included as our setters for those remain within the
	 * preferred constructors respectively. Our getter method then returns the
	 * calculated data in the order of Wins Percentage, Field Goal Percentages,
	 * and Free Throw Percentage.
	 * @param wins
	 * @param loses
	 * @param fieldGoals
	 * @param fieldGoalsAttempted
	 * @param freeThrows
	 * @param freeThrowsAttempted
	 */
	
	public void setStats(int wins, int loses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
	{
		this.wins = wins;
		this.loses = loses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
		
	}
	
	public double[] getStats()
	{
		double[] myStats = {wins/(wins+loses),fieldGoals/fieldGoalsAttempted, freeThrows/freeThrowsAttempted};
		
		return myStats;
		
	}
	
	
}
