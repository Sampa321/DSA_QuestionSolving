package HomePractice.InterviewPreparation;

public class PalindromeString {
   public static void main(String[] args) {
       String str = "A man a plan a canal Panama";
       StringBuilder str1 = new StringBuilder();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == ' ') continue;
           str1.append(str.charAt(i));
       }
       str = str1.toString();
       String re = str1.reverse().toString();
       if (str.equalsIgnoreCase(re)) {
           System.out.println("true");
           return;
       }
       System.out.println("false");
   }
}
