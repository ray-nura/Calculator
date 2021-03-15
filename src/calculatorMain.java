import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		double number1;
		double number2;
		char operator;
		double answer=0.0;
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Please enter first number: ");
		number1 = obj.nextDouble();
		System.out.println("write Arithmatic operator + or - or / or * ");
		operator = obj.next().charAt(0);
		System.out.println("Please enter second number: ");
		number2 = obj.nextDouble();
		
		switch (operator) {
		case '+': answer = number1+number2;
		break;
		case '-': answer = number1-number2;
		break;
		case '/': answer = number1/number2;
		break;
		case '*': answer = number1*number2;
		break;
				
		}
		System.out.println("Answer is: "+answer);
		

	}

}
