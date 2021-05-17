import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int end = 0;
		do {
			int choice;
			System.out.println("BJ - Table");
			scan.nextLine();
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.print("Choice >> ");
			choice = scan.nextInt();
			
			int firstNumber, secondNumber;
			switch(choice) {
				case 1:
					// ask input for first number and second number
					do {
						System.out.println("Input the first number [1-100](inclusive):");
						firstNumber = scan.nextInt();
						scan.nextLine();
					} while (firstNumber < 1 || firstNumber > 100);
					
					do {
						System.out.println("Input the second number [1-100](inclusive):");
						secondNumber = scan.nextInt();
						scan.nextLine();
					} while (secondNumber < 1 || secondNumber > 100);
					
					System.out.print("+");
					for(int i = 0; i < 119; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					
					// table consisting of basic java data types
					System.out.println("+  + (String type)  |  (Character Type)  |  * (Integer Type)  | / (Floating Type)  | input 1 == input 2 (Boolean Type)\t+");
					
					System.out.print("+");
					for(int i = 0; i < 119; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					
					int product = firstNumber * (secondNumber + 1);
					double division = (double) firstNumber / (double) secondNumber;
					System.out.printf("+\t%d + %d     |       %c  %c\t | \t%d\t      | \t%.3f\t   |\t\t  ", 
							firstNumber, secondNumber, firstNumber, secondNumber, product, division);
					
					System.out.print((firstNumber == secondNumber) ? "True " : "False");
					System.out.println("                 +");
					
					System.out.print("+");
					for(int i = 0; i < 119; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					
					System.out.println("Press enter to proceed...");
					scan.nextLine();
					
					System.out.println("");
					
					// table consisting of basic arithmetic operation
					System.out.print("+");
					for(int i = 0; i < 59; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					
					System.out.println("+Data Type : Integer\t\t\t\t\t    +");
					for(int i = 0; i < 60; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					
					System.out.println("+     +     |     -     |     *     |     /     |     %     +");
					for(int i = 0; i < 60; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					
					int secondNumberPlusOne = secondNumber + 1;
					System.out.printf("+    %d    |     %d     |   %d   |     %d      |     %d     +\n",
							firstNumber + secondNumberPlusOne, firstNumber - secondNumberPlusOne, firstNumber * secondNumberPlusOne, 
							firstNumber / secondNumberPlusOne, firstNumber % secondNumberPlusOne);
					
					for(int i = 0; i < 60; i++) {
						System.out.print("=");
					}
					System.out.println("+");
					System.out.println("Press enter to proceed...");
					scan.nextLine();
					
					// ask input for first boolean and second boolean
					boolean firstValue;
					do {
						System.out.println("Give me value for p1 [true | false]: ");
						firstValue = scan.nextBoolean();
						scan.nextLine();
					} while (firstValue != true && firstValue != false);
					
					boolean secondValue;
					do {
						System.out.println("Give me value for p2 [true | false]: ");
						secondValue = scan.nextBoolean();
						scan.nextLine();
					} while (secondValue != true && secondValue != false);
					
					
					
					System.out.println("+==================================================+");
					System.out.println("+Logical Table                                     +");
					System.out.println("+==================================================+");
					char upperFirstValue = (firstValue) ? 'T' : 'F';
					char upperSecondValue = (secondValue) ? 'T' : 'F';
					
					System.out.printf("+ P1 = %c , P2 = %c\n", upperFirstValue, upperSecondValue);
					System.out.println("+==============================================================================+");
					System.out.println("+        !P1        |        !P2         |        &&        |        ||        +");
					System.out.println("+==============================================================================+");
					System.out.printf("+       %-5s       |        %-5s       |      %-5s       |      %-5s       +\n",
							!firstValue, !secondValue, firstValue && secondValue, firstValue || secondValue);
					System.out.println("+==============================================================================+");
					
					break;
				
				case 2:
					end = 1;
					System.out.println("thank you for using apps!!");
					scan.nextLine();
					break;
				
			}
		} while (end == 0);
		

	}

}
