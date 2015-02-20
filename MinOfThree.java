import java.util.*;

public class MinOfThree {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int newCase = sc.nextInt();

        for(int i = 0; i < newCase; i++) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a < b) {
                if (a < c) {
                    System.out.println(a);
                    System.out.println(" ");                    
                }
                else {
                    System.out.println(c);
                    System.out.println(" ");
                }
                
            }
            else {
                if (b < c) {
                    System.out.println(b);
                    System.out.println(" ");
                }
                else {
                    System.out.println(c);
                    System.out.println(" ");
                }
            }
        }
    }
}
