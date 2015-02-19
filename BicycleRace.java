import java.util.Scanner;

class BicycleRace {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int nextCase = sc.nextInt();
		
		for(int i = 0; i < nextCase; i++)
		{
			double s = sc.nextInt();
			double a = sc.nextInt();
			double b = sc.nextInt();
			double time = (s / (a + b));
			
			System.out.println((a * time) + " ");
		}
		
		sc.close();
	}
}
