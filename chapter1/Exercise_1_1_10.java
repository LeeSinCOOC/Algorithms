package chapter1;

//完整模式;
//	double[] a;
//	a = new double[N];
//	for (int i = 0; i < N; i++)
//	{
//		a[i] = 0.0;
//	}
//简化写法：
//	double[] a = new double[N];
//声明初始化：
//	int[] a = {1,1,2,3,4,7};


public class Exercise_1_1_10 {
	public static void main(String[] args)
	{
		int[] a; //没有用new为它分配内存，会报错
		a = new int[10];
		for (int i = 0; i < 10; i++)
		{
			a[i] = i * i;
		}
		System.out.println(a); //[I@7f690630
		for (int i = 0; i < 10; i++)
		{
			System.out.println(a[i]);
//			1
//			4
//			9
//			16
//			25
//			36
//			49
//			64
//			81
		}
	}
}

