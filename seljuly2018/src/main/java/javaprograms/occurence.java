package javaprograms;

import java.util.Scanner;

public class occurence {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
	   Scanner scan = new Scanner(System.in);
	   String str = scan.nextLine();
	    NoOfOccurenceOfCharacters bb=new NoOfOccurenceOfCharacters();
	    bb.getOccuringChar(str);
	}
	}

