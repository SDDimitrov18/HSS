import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String user;
		
		System.out.println("======  Menu  =====");
		System.out.println("1.Enter  ");
		System.out.println("2.Exit ");
		System.out.printf("Enter: ");
		int n = scanner.nextInt();
		while(n < 1 || n > 3) {
			System.out.printf("Enter: ");
			n = scanner.nextInt();
		}
		switch(n) {
		case 1:
			System.out.println("======  Menu  =====");
			System.out.println("1.Login  ");
			System.out.println("2.Register ");
			System.out.println("3.Exit ");
			System.out.printf("Enter: ");
			n=0;
			n = scanner.nextInt();
			switch(n) {
				case 1:
					System.out.println("Please enter your username: ");
					System.out.println();
					user = scanner.next();
					System.out.println("======  Menu  =====");
					System.out.println(" Welcome");
					System.out.println("1.See activity status");
					System.out.println("2.See sensor status");
					System.out.println("3.See sensor durability");
					switch(n) {
					case 1:
						int a= 0;
			
						System.out.println(a++ + ". 10:00 > 2m clear");
						System.out.println(a++ + ". 10:20 2m > clear");
						System.out.println(a++ + ". 10:40 2m > clear");
						System.out.println(a++ + ". 11:00 2m > clear");
						System.out.println(a++ + ". 11:20 2m > clear");
						System.out.println(a++ + ". 11:40 2m > clear");
						System.out.println(a++ + ". 12:00 2m > clear");
						System.out.println(a++ + ". 12:20 2m > clear");
						System.out.println(a++ + ". 12:40 2m > clear");
						System.out.println(a++ + ". 13:00 2m > clear");
						System.out.println(a++ + ". 13:20 2m > clear");
						System.out.println(a++ + ". 13:40 2m > clear");
						System.out.println(a++ + ". 14:00 2m > clear");
					}
			}
			
		case 2:
			System.out.println("======  Menu  =====");
			System.out.println("Thank you for using our program");

			
		}
	}


	

}
