import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		
		// Creeaza obiectul " Scanner "
		Scanner input = new Scanner(System.in);
		
		// Iesirea
		System.out.println("Enter a line of text: ");
		//   sau 
		/*  System.out.println("Enter an int: ");
		 *  System.out.println("Enter a floating point value: ");
		 */
		
		// Asteapta ca userul sa introduca o linie de text
		String line = input.nextLine();
		//    sau
		/* int value = input.nextInt();
		 * double value = input.nextDouble();
		 */
		
		// Afiseaza ceea ce a introdus userul
		System.out.println("You entered: " + line);
		//   sau
		/* System.out.println("You entered: " + value);
		 * System.out.println("You entered: " + value);
		 */
		
	}

}
