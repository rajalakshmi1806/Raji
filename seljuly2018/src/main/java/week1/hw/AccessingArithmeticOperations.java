package week1.hw;
public class AccessingArithmeticOperations {
	public static void main(String[] args) {
		ArithmeticOperations aobj=new ArithmeticOperations();
		System.out.println("addition="+aobj.addition());  
		System.out.println("Subtraction="+aobj.subtraction());
		System.out.println("Multiply="+aobj.multiply());
		System.out.println("Multiply by 2="+aobj.multiplyNumberoneby2());
		System.out.println("Divide="+aobj.divideNumberTwoBy(2));		
	}
}
