package chapter1;

//����ģʽ;
//	double[] a;
//	a = new double[N];
//	for (int i = 0; i < N; i++)
//	{
//		a[i] = 0.0;
//	}
//��д����
//	double[] a = new double[N];
//������ʼ����
//	int[] a = {1,1,2,3,4,7};


public class Exercise_1_1_10 {
	public static void main(String[] args)
	{
		int[] a; //û����newΪ�������ڴ棬�ᱨ��
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

