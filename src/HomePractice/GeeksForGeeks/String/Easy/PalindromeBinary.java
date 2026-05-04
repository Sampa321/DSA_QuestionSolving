package HomePractice.GeeksForGeeks.String.Easy;

public class PalindromeBinary {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isBinaryPalindrome(16));
    }
    public static boolean isBinaryPalindrome(int n) {
        // code here
        StringBuilder binary = new StringBuilder();
        while(n != 0)
        {
            int r = n % 2;
            binary.append(r);
            n = n/2;
        }
        String original = binary.toString();
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
