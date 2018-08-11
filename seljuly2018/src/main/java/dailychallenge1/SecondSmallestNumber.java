package dailychallenge1;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberone=5,numbertwo=3,numberthree=9;
      System.out.println("Enter A Number" +numberone);
      System.out.println("Enter A Number" +numbertwo);
      System.out.println("Enter A Number" +numberthree);
    if((numberone>numbertwo) && (numbertwo>numberthree))
    System.out.println(numbertwo);
    else if((numberone>numberthree) && (numbertwo>numberthree))
    System.out.println(numberthree);
    else
    System.out.println(numberone + " is the second smallest number");	
	}

}

