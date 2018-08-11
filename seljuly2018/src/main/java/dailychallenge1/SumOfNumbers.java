package dailychallenge1;

public class SumOfNumbers {

	public static void main(String[] args) {
	int input[]= {13,25,9,56,54,89,17},sum=0;
	for(int number:input)
	{
	sum=sum+number;	
	}
	System.out.println("Sum of the numbers in array is "+sum);
}
}