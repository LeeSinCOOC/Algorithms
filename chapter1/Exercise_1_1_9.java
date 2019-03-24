package chapter1;

public class Exercise_1_1_9 {
	public static void main(String[] args)
	{
		String s = "";
		for (int n = 100; n > 0 ; n /=2)
		{
			s = (n % 2) + s;
		}
		System.out.println(s); //1100100
	}

}
