package Java.PatternPrinting;

public class Example13 {
   public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++)
        {
            int num = 65;
            for(int j = 0; j <= i; j++)
            {
                System.out.print((char)num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
