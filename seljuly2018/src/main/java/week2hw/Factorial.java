package week2hw;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		System.out.println("Enter the Number");
       Scanner scan=new Scanner(System.in);
       int number=scan.nextInt();
       for(int i=1;i<=number;i++)// num=4
       {
    	   fact=i*fact;    //i=1;fact=1*1=1;
    	                    //i=2; fact=2*1=2;
    	                    //i=3; fact=3*2=6;
    	                    //i=4; fact=4*6=12;
       }
       System.out.println(fact);
       
	}
}
