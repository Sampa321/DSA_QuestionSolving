package HomePractice.DailyPractice.Recursion;

public class Task {

    //print 1 to n using recursion
    public static void print1Ton(int n){
        if(n == 0) return;
        print1Ton(n-1);
        System.out.print(n+" ");
    }

    // print n to 1 using recursion
    public static void printNTo1(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printNTo1(n-1);
    }

    // Sum 1 to n number using recursion
    public static int sum1toN(int n)
    {
        if(n == 0) return 0;
        return n + sum1toN(n-1);
    }

    //Find factorial using recursion
    public static int facto(int n)
    {
        if(n == 0 || n == 1) return 1;
        return facto(n-1) * n;
    }


    // fibonacci series
    public static int fibonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }


    //reverse String
    public static String reverse(String str, int end)
    {
        if(end < 0) return "";
        return str.charAt(end) + reverse(str, end-1);
    }


    // Palindrome or not
    public static boolean palindrome(String str, int start, int end)
    {
        if (start >= end) return true;
        return str.charAt(start) == str.charAt(end) && palindrome(str, start+1, end-1);
    }


    // Find sum of digit
    public static int sumOfDigit(int n)
    {
        if(n == 0) return 0;
        return n%10 + sumOfDigit(n/10);
    }



    // Find subsequences of string
    public static void subSequence(String string, int c, String re)
    {
        if (c == string.length())
        {
            System.out.print(re +" ");
            return;
        }
        subSequence(string, c+1, re);
        subSequence(string, c+1, re+string.charAt(c));
    }












   public static void main(String [] args) {

       //print1Ton(10);

       //printNTo1(10);

      // System.out.println(sum1toN(10));

       //System.out.println(facto(5));


//       System.out.println("Fibonacci series : ");
//       for(int i = 0; i < 5;i++)
//       {
//           System.out.print(fibonacci(i)+ " ");
//       }

       String str = "madam";
//       int end = str.length()-1;
//       if(str.equals(reverse(str, end)))
//       {
//           System.out.println("Palindrome");
//       }
//       else {
//           System.out.println("Not palindrome");
//       }



//       if(palindrome(str, 0, str.length()-1))
//       {
//           System.out.println("Palindrome");
//       }
//       else {
//           System.out.println("not palindrome");
//       }


//       int n = 3271;
//       System.out.println(sumOfDigit(n));




       String str1 = "abc";
       subSequence(str1, 0, "");
    }
}
