package d141;
import java.util.Scanner;
import java.io.*;

public class Game_driver {
	

	static Character a = new Character();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printwriter outputFile = new Printwriter("Characters.txt");
	System.out.println("Hello, Welcome to the Game\nIf you have a Character already made press 1\nIf you want to make a new Character press 2");
	int x = sc.nextInt();
	//this is the printwriter option should go
	switch(x) 
	{
		case 1:
		{
			System.out.print("Please enter your name: ");
			String name = sc.nextLine();
			
			Scanner file = new Scanner(outputFile);
			String n = file.nextLine();
			
			if(n.equalsIgnoreCase(name))
			{
				System.out.println("Welcome back " + name + ", here are your stats: ");
				System.out.println("Gender : " + name.getGender());
				System.out.println("Armor : " + name.getArmor());
				System.out.println("Weapon : " + name.getWeapon());
				System.out.println("Agility : " + name.getAgility());
				System.out.println("Defense : " + name.getDefense());
			}
			break;
		}
	// new character
		case 2:
		{
			System.out.print("Please enter your name: ");
			String name = sc.nextLine();
			outputFile.println(name);
			outputFile.close();
			break;
		}
		default
			System.out.println("Invalid option\nIf you have a Character already made press 1\nIf you want to make a new Character press 2");
	}
	System.out.println("Are you a male or female : ");
	String gender = sc.next();
	a.setGender(gender);
	System.out.println("What type of armor would you like? (light, medium, or heavy) : ");
	String armor = sc.next();
	a.setArmor(armor);
	System.out.println("What is your weapon of choice? (dagger, sword, spear) : ");
	String weap = sc.next();
	a.setWeapon(weap);
	
	System.out.println("Gender : " + a.getGender());
	System.out.println("Armor : " + a.getArmor());
	System.out.println("Weapon : " + a.getWeapon());
	System.out.println("Agility : " + a.getAgility());
	System.out.println("Defense : " + a.getDefense());
	
	
	
}
}
