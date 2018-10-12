import java.util.Scanner;

public class Comparison {
	
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		int num1, 
		num2, 
		num3;
		
		System.out.println("\nInput the first number: ");
		num1 = input.nextInt();
		
		System.out.println("\nInput the second number: ");
		num2 = input.nextInt();
		
		System.out.println("\nInput the third number: ");
		num3 = input.nextInt();
	
		if (num1 > num2 && num1 > num3) {
			System.out.printf("\nThe first number %d is the largest of the three.\n",  num1);
		}

		else if (num2 > num1 && num2 > num3) {
			System.out.printf("\nThe second number %d is the largest of the three.\n", num2);
		}
		
		else if (num3 > num2 && num3 > num1) {
			System.out.printf("\nThe third number %d is the largest of the three.\n", num3);
		}
		
		else if (num1 == num2 && num1 > num3){
			System.out.printf("\nThe first and second numbers %d are the largest of the three.\n", num1);
		}
		
		else if (num3 == num1 && num3 > num2){
			System.out.printf("\nThe first and third numbers %d are the largest of the three.\n", num3);
		}
		
		else if (num3 == num2 && num3 > num1){
			System.out.printf("\nThe second and third numbers %d are the largest of the three.\n", num3);
		}
		
		else {
			System.out.println("\nThe three numbers are equal.\n");
		}
	
	
	
	
	
	
	}
	
}