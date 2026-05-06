package HomePractice.DailyPractice;

import java.util.ArrayList;
import java.util.Stack;

public class practice {
        public static void main(String[] args) {
            String str = "abc";
            char []strArray = str.toCharArray();
            boolean []track = new boolean[strArray.length];
            ArrayList<Character> list = new ArrayList<>();
            permutation(strArray, track, "");
        }
        public static void permutation(char []strArray, boolean []track, String re){
            if(re.length() == strArray.length)
            {
                System.out.println(re);
                return;
            }
            for(int i = 0; i< strArray.length; i++)
            {
                if(!track[i])
                {
                    // list.add(strArray[i]);
                    re += strArray[i];
                    track[i] = true;
                    permutation(strArray,track,re);
                    // list.removeLast();
                    re = re.substring(0,re.length()-1);
                    track[i] = false;
                }
            }
        }
}
