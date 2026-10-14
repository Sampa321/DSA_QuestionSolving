package HomePractice.DailyPractice.Backtracking.UniqueElement;

public class PermutationOfStringWithExtraSpace {
    public static void permutation(char []charArray, String re, boolean []track)
    {
        if(re.length() == charArray.length)
        {
            System.out.print(re+" ");
            return;
        }

        for(int i = 0; i < charArray.length; i++)
        {
            if(!track[i])
            {
                re += charArray[i];
                track[i] = true;
                permutation(charArray, re, track);
                re = re.substring(0, re.length()-1);
                track[i] = false;
            }
        }
    }
   public static void main(String[] args) {
        String str = "abc";
        char []charArray = str.toCharArray();
        String re = "";
        boolean []track = new boolean[charArray.length];
        permutation(charArray, re, track);
    }
}
