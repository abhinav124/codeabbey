import java.util.*;
import java.math.*;


class Fibo
{
	private static ArrayList<BigInteger> cache = new ArrayList<BigInteger>();
	static 
	{
		cache.add(BigInteger.ZERO);
		cache.add(BigInteger.ONE);
	}
	
	public static BigInteger fib(int n) {
              if (n >= cache.size()) {
                  cache.add(n, fib(n-1).add(fib(n-2)));
              }
              return cache.get(n);
       }
		
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int nextCase = nextInt();
		for(int i=0; i<nextCase; i++)
		{
			
		}
	}
		
}
