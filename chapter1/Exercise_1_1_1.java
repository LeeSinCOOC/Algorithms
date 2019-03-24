package chapter1;

public class Exercise_1_1_1 {
	public static void main(String[] args)
	{
		int a ;
		double b;
		boolean c;
		
		a = ( 0 + 15) / 2; 	
		b = 2.0e-6 * 1000000.1;
		c = true && false || true && true;
		
		System.out.println("a:"+ a);
		System.out.println("b:"+ b);
		System.out.println("c:"+ c);
		
//		a:7
//		b:2.0000001999999997
//		c:true
	}
}
