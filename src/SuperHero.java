import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the SuperHero Class with necessary properties and methods
 * @version 1.0  Feb-06-2015 Creating the SuperHero Class with necessary Properties and constructor
 * @version 2.0 Feb-06-2015 Add the necessary methods in the SuperHero Class
 * 
 *  */

public class SuperHero extends Hero {

	String[] superpowers = new String[3] ;
	
	/**
     * Constructor to create objects of class SuperHero
     * @param name The name of the SuperHero
     */
	public SuperHero(String name) {
		super(name);		
		
		//Call generate Power Method
		generateRandomPowers();
	}
	
	/**
     * This method creates Powers of the SuperHero
     */
	private void generateRandomPowers()
	{
		 String power[] = {"Super Speed", "Super Strength","Body Armour","Flight","Fire	Generation","Weather Control"};	 	 
		 List<Integer> number = new ArrayList<Integer>();
		 for(int i=0; i<=5 ; i++)
		 {
			 number.add(i);
		 }
		 
		 Collections.shuffle(number);
		 
		 for(int i=0; i<=2;i++)
		 {
			 
			 superpowers[i] = power[number.get(i)];
		 }
	}
	
	/**
	 * This method displays Powers of the SuperHero
	 */
	public void showPowers()
	{
		for(int i=0; i<=2;i++)
		{
			System.out.println("Power "+ (i+1) +": " + superpowers[i]);
		}
	}
}
