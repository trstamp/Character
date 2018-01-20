import java.util.Scanner;
import java.io.*;

public class Character
{
	private int agility;
	private int defense;
	private String gender;
	private String armor;
	private String weapon;
	PrintWriter outputFile = new PrintWriter();
	
	public void setGender(String gen)
	{	
		gender = gen;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Are you male or female?");
		gen = kb.nextLine();
		
		if(gen.equalsIgnoreCase("male")
		{
			gender = male;
		}
		else if(gen.equalsIgnoreCase("female")
		{
			gender = female;
		}
		else
		{
			System.out.print("Sorry, I didn't catch that. Are you male or female? : ");
			gen = kb.nextLine();
		}
	}
	public void setArmor(String arm)
	{	
		armor = arm;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What type of armor would you like? (light, medium, or heavy) : ");
		arm = kb.nextLine();
		
		if(arm.equalsIgnoreCase("light")
		{
			agility = 4;
			defense = 0;
		}
		else if(arm.equalsIgnoreCase("medium")
		{
			agility = 2;
			defense = 2;
		}
		else if(arm.equalsIgnoreCase("heavy")
		{
			agility = 0;
			defense = 4;
		}
		else
		{
			System.out.print("Sorry, I didn't catch that. What type of armor would like? (light, medium, or heavy) : ");
			arm = kb.nextLine();
		}
	}
	public void setWeapon(String weap)
	{	
		weapon = weap;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What is your weapon of choice? (dagger, sword, spear) : ");
		weap = kb.nextLine();
		
		if(weap.equalsIgnoreCase("dagger")
		{
			agility + 2 = agility;
			defense + 0 = defense;
		}
		if(weap.equalsIgnoreCase("sword")
		{
			agility + 1 = agility;
			defense + 1 = defense;
		}
		if(weap.equalsIgnoreCase("spear")
		{
			agility + 0 = agility;
			defense + 2 = defense;
		}
		else
		{
			System.out.print("Sorry, I didn't catch that. What is your weapon of choice? (dagger, sword, spear) : ");
			weap = kb.nextLine();
		}
	}
	public int getAgility()
	{
		return agility;
	}
	public int getDefense()
	{
		return defense;
	}
	public String getArmor()
	{
		return armor;
	}
	public String getWeapon()
	{
		return weapon;
	}
	public String getGender()
	{
		return gender;
	}
}
