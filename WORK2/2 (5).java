package ex2;
import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter annual interest rate, e.g., 7.25: ");
		double annualInterestRate = input.nextDouble();
		
		double mouthlyInterestRate = annualInterestRate / 1200;
	
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		double mouthlyPayment = loanAmount * mouthlyInterestRate / (1 - 1 / Math.pow(1 + mouthlyInterestRate, numberOfYears * 12));
		double totalPayment = mouthlyPayment * numberOfYears * 12;
		
		System.out.println("The mouthly payment is $" + (int)(mouthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	}
}
