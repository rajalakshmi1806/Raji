package week2hw;

import java.util.Scanner;

public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number1" );
	   int a=scan.nextInt();
	   System.out.println("Enter Number2");
	   int b=scan.nextInt();
	   System.out.println("Enter Operator");
	   Scanner scanOne=new Scanner(System.in);
	   String st=scanOne.nextLine();
	   switch(st)
	   {
	   case "+":
		   System.out.println("Addition of two Numbers:"+(a+b));
		   break;
	   case "-":
		   System.out.println("Subtraction of two Numbers:"+(a-b));
		   break;
	   case "*":
		   System.out.println("Multiplication of two Numbers:"+(a*b));
		   break;
	   case "/":
		   System.out.println("Division of two Numbers:"+(a/b));
		   break;
	   
	}
	}

}
