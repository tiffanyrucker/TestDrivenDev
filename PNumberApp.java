import java.util.Scanner;

public class PNumberApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int userNum;
		String wantsToContinue = "s";

		do {
			System.out.println("Let's locate some prime number!");
			System.out.println("This application will find any prime number, in order, from first prime number on.");
			System.out.println ("Which prime number are you looking for?");
			userNum = scan.nextInt();
			System.out.println("The number " + userNum + " prime is " + PrimeNumberMethod.getNthPrime(position) + ".");
			System.out.println("Do you want to find another prime number? (y/n)");
		} while (wantsToContinue.equals("y"));
		

		System.out.println("Goodbye");
	}

}