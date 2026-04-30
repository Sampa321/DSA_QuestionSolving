package HomePractice.InterviewPreparation;

import java.util.HashMap;

public class NonRepeatingCharacter {
   public static void main(String[] args) {
        String str = "aabbcde";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0 ; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(map.get(ch) == 1)
            {
                System.out.println(ch);
                return;
            }
        }

    }
}
