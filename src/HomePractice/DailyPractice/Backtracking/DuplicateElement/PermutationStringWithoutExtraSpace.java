package HomePractice.DailyPractice.Backtracking.DuplicateElement;

import java.util.Arrays;

public class PermutationStringWithoutExtraSpace {
    public static void permutation(char []charArray, String re, boolean []track)
    {
        Arrays.sort(charArray);
        if (re.length() == charArray.length)
        {
            System.out.println(re +" ");
            return;
        }

        for(int i = 0; i < charArray.length; i++)
        {
            if (i > 0 && charArray[i-1] == charArray[i] && !track[i-1])  continue;
            if (!track[i])
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
        String str = "abacd";
        char []charArray = str.toCharArray();
        boolean []track = new boolean[charArray.length];
        permutation(charArray, "", track);
    }
}
