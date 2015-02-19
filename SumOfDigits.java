/* package whatever; // don't place package name! */

import java.util.*;

class Solution
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
			System.out.println(total);
			int ans = total;
			ans = ans % 10;
			
			while(ans != 0)
			{
				System.out.println(ans);
			}
		}
	}
}
