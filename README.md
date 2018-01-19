import java.util.Scanner

public class Character
{
	private int agility;
	private int defense;
	private String gender;
	private String armor;
	private String weapon;
	
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
			System.out.print("Sorry, I didn't catch that. Are you male or female?");
			gen = kb.nextLine();
		}
	}
	public void setArmor(String arm)
	{	
		armor = arm;
	}
	public void setWeapon(String weap)
	{	
		weapon = weap;
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
