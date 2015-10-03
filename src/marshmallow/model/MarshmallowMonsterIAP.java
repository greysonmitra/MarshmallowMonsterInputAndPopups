package marshmallow.model;

public class MarshmallowMonsterIAP 
{
	private String monsterName;
	private int monsterEyes;                               //These are the declarations I think?
	private int monsterNoses;							   //These are actually variables...
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmallowMonsterIAP()
	{
		
	}
	
	public MarshmallowMonsterIAP(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton )
	//^^^ This right here is the constructor I think?
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;             //I think these are the methods or maybe declarations?
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	//Getters and Setters (I did them out of order, but it goes all getters, then all setters)
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	
	
	
	
	
	
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;				//If this line said monsterNoses, it would compile correctly, but give a logic error and give the wrong value.
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}	
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	

	public String toString()
	{
		String monster = " This monster has " + monsterEyes + " eyes, " + monsterHair + " hair, " + monsterNoses + " Noses, " + monsterLegs + " Legs, " + " a " + monsterBellyButton + " bellybutton" + " and its' name is " + monsterName;
		
		return monster;
	}
}
