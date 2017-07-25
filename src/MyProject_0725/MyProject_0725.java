package MyProject_0725;

import java.util.Scanner;

public class MyProject_0725 {
	public static void main (String[] args) {
		String response = null;
		do {
			System.out.println("would you like to continue? y/n");
			Scanner scan = new Scanner (System.in);
			response = scan.nextLine();
		} while (response.equalsIgnoreCase("y"));
		if(!response.equalsIgnoreCase("n")){
			System.out.println("Error Message");
		}
	}
}
