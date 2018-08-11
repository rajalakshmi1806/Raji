package dailychallenge1;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.out.print("Enter a String: ");
		        Scanner scan = new Scanner(System.in);
		        String str = scan.nextLine();
		        System.out.printf("Reverse of %s is %s",str,reverse(str));
				int nameLength=str.length();
				System.out.print("\nLength Of the String is ");
				System.out.println(nameLength);
		    }
		 
		    public static String reverse(String str) {
		 
		        if ((null == str) || (str.length() <= 1)) {
		            return str;
		        }
		        // recursively add firstj char at end and reverse rest of the string
		        return reverse(str.substring(1)) + str.charAt(0);
		    }		
		  }


