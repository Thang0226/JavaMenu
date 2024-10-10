import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	int choice = -1;
	Scanner scanner = new Scanner(System.in);

	while (choice != 0) {
	    System.out.println();
	    System.out.println("""
		    Menu:
		    1. Calculate sum of odd numbers
		    2. Check prime number
		    3. Find number of days in a month
		    0. Exit
		    Enter your choice:""");
	    choice = scanner.nextInt();

	    switch (choice) {
		case 1:
		    int a = 0;
		    System.out.println("-----Calculate sum of odd numbers from 1 to given number-----");
		    while ((a <= 10) || (a >= 100)) {
			System.out.println("Enter a number (10 < number < 100):");
			a = scanner.nextInt();
		    }

		    int sum = 0;
		    for (int i = 1; i <= a; i++) {
			if (i % 2 == 1) {
			    sum += i;
			}
		    }

		    System.out.println("Sum of odd numbers: " + sum);
		    break;

		case 2:
		    int b = 0;
		    System.out.println("-----Check a number is prime or not-----");
		    while (b <= 0) {
			System.out.println("Enter a number (number > 0):");
			b = scanner.nextInt();
		    }

		    boolean isPrime = true;
		    double n = Math.sqrt(b);
		    for (int i = 2; i <= n; i++) {
			if (b % i == 0) {
			    isPrime = false;
			    break;
			}
		    }

		    if (isPrime) {
			System.out.println("Prime number!");
		    } else {
			System.out.println("NOT a prime number!");
		    }
		    break;

		case 3:
		    int month = 0;
		    System.out.println("-----Find number of days in a month-----");
		    while ((month < 1) || (month > 12)) {
			System.out.println("Enter a month number (1 <= number <= 12):");
			month = scanner.nextInt();
		    }

		    switch (month) {
			case 2:
			    System.out.println("Month 2 has 29 days in leap year and 28 days in ordinary year.");
			    break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			    System.out.println("Month " + month + " has 31 days.");
			    break;
			case 4:
			case 6:
			case 9:
			case 11:
			    System.out.println("Month " + month + " has 30 days.");
			    break;
			default:
			    System.out.println("Not a valid month!");
		    }
		    break;

		case 0:
		    System.exit(0);

		default:
		    System.out.println("Not a choice!");
	    }
	}
    }
}