package chapter1;

public class Exercise_1_1_7 {
//	public static void main(String[] args)
//	{
//		String s;
//		double t = 9.0;
//		
//		while (Math.abs(t - 9.0/t) > .001)
//		{
//			t = (9.0 / t + t) / 2.0;
//			System.out.printf("%.5f\n", t);
//		}
//	}
//	5.00000
//	3.40000
//	3.02353
//	3.00009
	
//	public static void main(String[] args)
//	{
//		int sum = 0;
//		for (int i = 1; i < 1000; i++)
//		{
//			for (int j = 1; j < i; j++)
//			{
//				sum ++;
//			}
//		}
//		
//		System.out.println(sum); 498501
//	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i < 1000 ; i++)
		{
			for (int j = 1; j < 1000; j++)
			{
				sum++;
			}
		}
		System.out.println(sum); //998001
	}

}
