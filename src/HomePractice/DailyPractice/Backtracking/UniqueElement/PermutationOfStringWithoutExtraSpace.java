package HomePractice.DailyPractice.Backtracking.UniqueElement;

public class PermutationOfStringWithoutExtraSpace {
    public static void permutation(char []charArray, String re, int p)
    {
        if (p == charArray.length)
        {
            System.out.print(re +" ");
            return;
        }
        for(int i = p; i < charArray.length; i++)
        {
            swap(charArray, i, p);
            re += charArray[p];
            permutation(charArray, re, p+1);
            swap(charArray, i, p);
            re = re.substring(0, re.length()-1);
        }
    }

    public static void swap(char []charArray, int p, int i)
    {
        char temp = charArray[i];
        charArray[i] = charArray[p];
        charArray[p] = temp;
    }

   public static void main(String[] args) {
        String str = "abc";
        char []charArray = str.toCharArray();
        permutation(charArray, "", 0);
    }
}
