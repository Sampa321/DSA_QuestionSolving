package ClassPractice.MainTopic.Recursion;

public class Example2 {
    public static void f1(int n)
    {
        if(n==0) return;
        f1(n-1);
        System.out.println(n);
        f1(n-1);
    }

    static void main() {
        f1(3);
    }
}
