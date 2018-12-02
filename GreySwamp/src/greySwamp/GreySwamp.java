package greySwamp;

import java.util.Scanner;

public class GreySwamp {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = user.next();
		System.out.println("Hello " +name+ ", Welcome to the Game!");
		System.out.println(" ");
		System.out.println("You've just awoken from a deep slumber and you find yourself in a barren moor in the middle of nowhere");
		System.out.println("Would you like to look around? 'Yes' or 'No'");
		String North, South, East, West, Eat;
	    Eat = user.next();

	    if (Eat.equalsIgnoreCase("Yes")) {
	        System.out.println("  ");
	        System.out.println("You live!");
	    }

	    else if (Eat.equalsIgnoreCase("No")) {
	        System.out.println("  ");
	        System.out.println("You die of starvation!");
	    }
		user.close();

	}
}
