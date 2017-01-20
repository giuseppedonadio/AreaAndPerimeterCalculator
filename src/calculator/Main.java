package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			//ask user insert data
			System.out.println("Enter Lenght: ");
			double length = Double.parseDouble(sc.nextLine());			
			System.out.println("Enter Width: ");
			double width = Double.parseDouble(sc.nextLine());
			
			System.out.println("Continue? y/n");
			choice = sc.nextLine();
			System.out.println();
				
		}
		sc.close();
		System.out.println("Bye!");

	}

}
