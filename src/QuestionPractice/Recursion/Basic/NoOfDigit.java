package QuestionPractice.Recursion.Basic;
/*
Given a number 'n', count the number of digits in 'n' using recursion
 */
public class NoOfDigit {
   public static int totalDigit(int n){
        if(n == 0) return 0;
        return 1 + totalDigit(n/10);
    }
   public static void main(String[] args) {
        int n = 0;
        if(n == 0){
           System.out.println(1);
           return;
       }
       System.out.println(totalDigit(n));
    }
}
