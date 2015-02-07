
import java.util.Random;

/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the Hero Class with necessary properties and methods
 * @version 1.0  Jan-30-2015 Creating the Hero Class with necessary Properties and constructor
 * @version 2.0 Jan -30-2015 Add the necessary methods in the Hero Class
 * @version 3.0 Feb-06-2015 Take the Hero Class from the Assignment1
 * 
 *  */
public class Hero {
	
	//Private Properties-----------
	private int strength;
	private int speed;
	private int health;
	public String name;
	

	int attempt; //for checking Purpose
	
	//Create object for generating random numnber
	Random randomGenerator = new Random();
	
	/**
     * Constructor to create objects of class Hero
     * @param name The name of the Hero
     */
	public Hero(String name){
		this.name = name;
		this.generateAbilities();
	}
	
	/**
     * This method creates abilities of the Hero
     */
	private void generateAbilities()
	{
		this.strength = randomGenerator.nextInt(100);
		this.speed = randomGenerator.nextInt(100);
		this.health = randomGenerator.nextInt(100);
	}
	
	/*
	 * This method displays how much damage occured during the fight, 
	 */
	public void fight()
	{
		if(hitAttempt())
		{
			System.out.println("Hit Damage of "+ this.name +" is "+hitDamage());
		}
	}
	
	/**
	 * This method generates the Hit attempts
	 * @return true if the hit attempts otherwise false
	 */
	private boolean hitAttempt()
	{
		 //Get the attempt using random number
		 attempt = randomGenerator.nextInt(100);
		 
		 ///For checking purpose print hit attempt.
		 System.out.println("Randomly genrated Hit attempt Number:" + attempt);
		 if(attempt <= 20)
		 {
			 return true;
		 }
		 return false;
	}
	 
	/**
	 * This Calculates the hit Damage
	 * @return howmuch hit damaged during the fight
	 */
	private int hitDamage()
	{
		 return (this.strength * randomGenerator.nextInt(6));
	}
	
	/**
	 * This method displays abilities of the Hero
	 */
	public void show()
	{
		 System.out.println(this.name +"'s Ability Score ");
		 System.out.println("*********************************************");
		 System.out.println("Strength =" + this.strength);
		 System.out.println("Speed =" + this.speed);
		 System.out.println("Health ="+this.health);
	}
}
