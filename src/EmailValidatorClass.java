import java.util.Scanner;

public class EmailValidatorClass {
	
	static String[] emailIDs = new String[] { "bob@email.com", "sally@email.com", "mike@email.com", "terry@email.net",
			"sara@email.org" };
	static char tryAgain = 'n';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome!");

		// TODO Auto-generated method stub
		do {
			System.out.print("Please enter an email to see if there is a match in our records: ");

			String inputEmail = sc.nextLine();

			boolean found = false;

			for (String dbEmail : emailIDs) {
				if (dbEmail.equals(inputEmail)) {
					System.out.println("Match found!");
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("We couldn't find a match...");
			}

			System.out.println("Would you like to try another email? (Y/N): ");
			String response = sc.nextLine();
			tryAgain = response.toLowerCase().charAt(0);
		} while (tryAgain == 'y');

		System.out.println("Goodbye!");

	}

}
