package QuestionPractice.Recursion.Basic;
/*
Given a number 'n', check if it is a palindrome using recursion
 */
public class PalindromeCheck {
    static int rev = 0;
    public static int palindrome(int num){
        if(num == 0) return rev;
        rev = rev*10 + num % 10;
       return palindrome(num/10);
    }
   public static void main(String[] args) {
        int n = 120;
        rev = 0;
        if(palindrome(n) == n)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
