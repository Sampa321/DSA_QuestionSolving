package HomePractice;

public class revision {
    static void main() {
        int n=4;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
