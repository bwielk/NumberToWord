package numToWords;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Converter converter = new Converter();
	
	public static void main(String args[]){
		boolean running = true;
		int choice = 0;
		System.out.println("\nTo quit, press 0. To start, press 1");
		while(running){
			System.out.println("\nEnter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0:
				running = false;
				break;
			case 1:
				runApplication();
				break;
			}
		}
	}
	
	private static void runApplication(){
		System.out.println("\nEnter a number between 0 and 999,999,999");
		int input = scanner.nextInt();
		System.out.println("\n" + input + " => " + converter.run(input));
	}

}
