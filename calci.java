package kanna;
import java.util.Scanner;
public class calci {
	public static void main(String[] args) {
	double num1,num2;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the numbers");
	num1=sc.nextDouble();
	num2=sc.nextDouble();
	System.out.println("Enter an operator(+,-,*,/)");
	char operator=sc.next().charAt(0);
	double output=1;
	switch (operator) {
	case'+':
		output=num1+num2;
		break;
	case'-':
		output=num1-num2;
		break;
	case'*':
		output=num1*num2;
			break;
	case'/':
		output=num1/num2;
		break;
		default:
			System.out.println("Wrong input");
			break;
	}
	 System.out.println(num1+" "+operator+" "+num2+": "+output);
	}
}
