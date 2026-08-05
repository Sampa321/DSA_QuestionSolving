package Java.PatternPrinting;

public class Example14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++)
        {
            int num = 65;
            for(int j = 0; j < n-i; j++)
            {
                System.out.print((char)num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
