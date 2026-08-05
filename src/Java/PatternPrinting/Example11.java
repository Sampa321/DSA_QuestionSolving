package Java.PatternPrinting;

public class Example11 {
   public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(i+j +" ");
            }
            for(int j = 1 ; j <= (2*n-2*i); j++)
            {
                System.out.print("  ");
            }
            for(int j = i-1; j >= 0; j--)
            {
                System.out.print(i+j +" ");
            }
            System.out.println();
        }
    }
}
