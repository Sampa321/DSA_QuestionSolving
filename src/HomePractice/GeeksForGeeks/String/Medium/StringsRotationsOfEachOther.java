package HomePractice.GeeksForGeeks.String.Medium;
/*

 */
public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }
    public static boolean areRotations(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;
        StringBuilder rotate = new StringBuilder();
        rotate.append(s1.charAt(s1.length() - 1));
        for(int i = 0; i < s1.length()-1; i++)
        {
            rotate.append(s1.charAt(i));
        }
        System.out.println(rotate);
        while(!rotate.toString().equals(s1))
        {
            if(rotate.toString().equals(s2))
            {
                return true;
            }
            String actual = rotate.toString();
            rotate = new StringBuilder();
            rotate.append(actual.charAt(actual.length() - 1));
            for(int i = 0; i < actual.length()-1; i++)
            {
                rotate.append(actual.charAt(i));
            }
        }
        return false;
    }
}
