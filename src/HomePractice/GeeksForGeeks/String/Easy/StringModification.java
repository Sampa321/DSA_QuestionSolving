package HomePractice.GeeksForGeeks.String.Easy;

public class StringModification {
   public static void main(String[] args) {
        String str = "aaabc";
        boolean dubba[] = new boolean[str.length()];
       System.out.println(rearrangeString(str,dubba));
    }
    public static String rearrangeString(String str,boolean []dubba) {  //aaabc
        // Your code here
        String result = "";
        result += str.charAt(0);//a
        for(int  i = 1 ;i<str.length();i++)
        {
            for(int j = 1;j<str.length();j++)
            {
                if(str.charAt(j)!= result.charAt(result.length()-1) && !dubba[j]) {
                    result += str.charAt(j);
                    dubba[j] = true;
                    break;
                }
            }
        }
        return result;
    }
}
