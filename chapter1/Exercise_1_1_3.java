package chapter1;

public class Exercise_1_1_3 {
	public static void main(String[] args)
	{
		int a,b,c;
		a = b = c = 0;
		System.out.println("请输入三个数：");
		a = StdIn.readInt(); //需要作者库
		b = StdIn.readInt();
		c = StdIn.readInt();
			
		if (equals(a,b,c) == 1)
		{
			System.out.print("equal");
		}
		else
		{
			System.out.print("not equal");
		}
		
	}
	public static int equals(int a, int b ,int c)
	{
		if (a == b && b == c)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}
