import java.util.Scanner;

class BodyMass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nextCase = sc.nextInt();

        for(int i = 0; i < nextCase; i++)
        {
            double kilo = sc.nextInt();
            double height = sc.nextDouble();
            double heightSqr = height*height;
            double mass = (kilo/heightSqr);
            // System.out.println(mass);

            if(mass < 18.5)
            {
                System.out.println("under ");
            }
            else if(mass < 25.0 && mass >= 18.5)
            {
                System.out.println("normal ");
            }
            else if(mass < 30.0 && mass >= 25.0)
            {
                System.out.println("over ");
            }
            else
            {
                System.out.println("obese ");
            }
        }
        sc.close();
    }
}
