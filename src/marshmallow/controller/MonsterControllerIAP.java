package marshmallow.controller;

import marshmallow.model.MarshmallowMonsterIAP;
import marshmallow.view.MarshmallowOutputIAP;
import java.util.Scanner;

public class MonsterControllerIAP 
{
	private MarshmallowMonsterIAP greysonMonster;
	private MarshmallowMonsterIAP userMonster;
	private MarshmallowOutputIAP myOutput;
	private Scanner monsterScanner;
	
	
	
	
	
	public MonsterControllerIAP()
	{
		int eyes = 4;
		double legs = 8;
		double hair = 1;
		int noses = 1;
		boolean hasbellybutton = false;
		String name = "Fuddy Duddy";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutputIAP();
		greysonMonster = new MarshmallowMonsterIAP(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in MarhmallowMonster.java
	}
	public void start()
	{
//		myOutput.displayMonsterConsole(greysonMonster.toString());
		myOutput.displayMonsterGUI(greysonMonster.toString());
		//makeUserMonster();
//		myOutput.displayMonsterGUI("New Monster Info:" + userMonster.toString());		//This was made into a comment because it wanted to use user input that didn't exist yet.
		
		String temp = myOutput.grabAnswer("Type in your desired monster name");
		myOutput.showResponse("You typed: " + temp);
		
		
		
		String tempEyes = myOutput.grabAnswer("Type in your desired amount of monster eyes");
		int myEyes;
		
		while(!isInteger(tempEyes))
		{
			tempEyes = myOutput.grabAnswer("Type in a positive integer for your monster's eyes!!!!!");
		}
		
		if(isInteger(tempEyes))
		{
			myEyes = Integer.parseInt(tempEyes); 
		}
		else
		{
			myEyes = -9999999;
		}
		
		
		myOutput.showResponse("You typed: " + myEyes);
		

		String tempHair = myOutput.grabAnswer("Type in your desired amount of monster hair");
		double myHair; 
		
		while(!isDouble(tempHair))
		{
			tempHair = myOutput.grabAnswer("Type in a positive floating-point for your Hair!!!!!");
		}
		
		if(isDouble(tempHair))
		{
		
			myHair = Double.parseDouble(tempHair);
		}
		else
		{
			myHair = -999999.9;
		}
		
		myOutput.showResponse("You typed: " + myHair);
		
		
	}
	
	
	
	
	
	private void askQuestions()

	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		greysonMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		greysonMonster.setMonsterEyes(betterMonsterEyes);
		
		System.out.println("Type in a different number of noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		greysonMonster.setMonsterNoses(betterMonsterNoses);
		
		System.out.println("Type in a different number of hair for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		greysonMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Type in a new number for the monster's legs");
		double betterMonsterLegs = monsterScanner.nextDouble();
		greysonMonster.setMonsterLegs(betterMonsterLegs);
		
		System.out.println("Does the monster have a bellybutton? True or false.");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		greysonMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}
	
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get variables
		String userName;	//Declares (YAY DECLARATIONS) a String type called userName
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton; 
		
		//Step two: Define variables by using Scanner to get user input.
		System.out.println("Type in a name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in a number of eyes for your monster");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in a number of noses for your monster.");
		userNoseCount                 = monsterScanner.nextInt();
		System.out.println("How much hair do you want your monster to have? Type in a floating point or decimal number");
		userHair = monsterScanner.nextDouble();
		System.out.println("How many Legs do you want your monster to have? Any real number will work");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does your monster have a bellybutton? Type in True or False");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor! (The order of the parameters matters and must match the order of everything else)
		userMonster = new MarshmallowMonsterIAP(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
		
	}
}
