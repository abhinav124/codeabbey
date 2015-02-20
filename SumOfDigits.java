/* package whatever; // don't place package name! */

import java.util.*;

class SumofDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int nextCase = sc.nextInt();

		for(int i = 0; i < nextCase; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int total = (a * b) + c;
			// System.out.println(total);
			int sum = 0;

			while(total != 0)
			{
				sum += total % 10;
				total /= 10;
			}
				System.out.println(sum + " ");
		}
	}
}
