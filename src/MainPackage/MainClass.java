package MainPackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		int answer;
		Scanner input = new Scanner(System.in);



		System.out.println("Hungry.");
		System.out.println("Get in line.");
		System.out.println("Buy Lunch.");
		System.out.println("Are you thirsty? 0 = No, 1 = Yes.");
		answer = input.nextInt();


		if (answer == 1)
		{
			System.out.println("Buy Coke.");
			System.out.println("Eat Lunch.");
			System.out.println("Return tray.");
			System.out.println("Leave.");
		}
		if (answer == 0)
		{
			System.out.println("Get water.");
			System.out.println("Eat Lunch.");
			System.out.println("Return tray.");
			System.out.println("Leave.");
		}


	}

}
