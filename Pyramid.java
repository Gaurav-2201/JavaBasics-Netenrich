//import java.util.*;
class Pyramid
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		int a = 65;
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
	}
}