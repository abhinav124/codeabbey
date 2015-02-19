import java.util.Scanner;

class Solution
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int max = 0;
    int min = 0;
    

    for(int i = 0; i < 300; i++)
    {
      int comp = in.nextInt();
      
      if(comp > max)
      {
      	max = comp;
      }
      else if(comp < min)
      {
      	min = comp;
      }
    }

    System.out.println(max + " " + min);
  }
}
