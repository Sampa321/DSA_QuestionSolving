package HomePractice.InterviewPreparation;

import java.util.HashMap;

public class CountFrequencyOfCharacters {
   public static void main(String[] args) {
        String str = "programming";
       HashMap<Character,Integer> hs = new HashMap<>();
       for(int i = 0; i < str.length(); i++)
       {
           char ch = str.charAt(i);
           hs.put(ch,hs.getOrDefault(ch,0)+1);
       }
       for(char ele : hs.keySet())
       {
           System.out.println(ele+" - "+hs.get(ele));
       }
    }
}
