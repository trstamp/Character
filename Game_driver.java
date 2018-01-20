package d141;
import java.util.Scanner;

public class Game_driver {
	

	static Character a = new Character();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	System.out.println("Hello, Welcome to the Game\nIf you have a Character already made press 1\nIf you want to make a new Character press 2");
	//this is the printwriter option should go
	
	// new character
	
	System.out.println("Are you a male or female : ");
	String gender = sc.next();
	a.setGender(gender);
	System.out.println("What type of armor would you like? (light, medium, or heavy) : ");
	String armor = sc.next();
	a.setArmor(armor);
	System.out.println("What is your weapon of choice? (dagger, sword, spear) : ");
	String weap = sc.next();
	a.setWeapon(weap);
	
	System.out.println(a.getGender());
	System.out.println(a.getArmor());
	System.out.println(a.getWeapon());
	System.out.println(a.getAgility());
	System.out.println(a.getDefense());
	
	
	
}
}
