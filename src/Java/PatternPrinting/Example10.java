package Java.PatternPrinting;

public class Example10 {
   public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++)
        {
            int ele = i%2 == 0? 1: 0;
            for(int j = 0; j <= i; j++)
            {
                System.out.print(ele + " ");
                ele = ele == 0? 1: 0;
            }
            System.out.println();
        }
    }
}
