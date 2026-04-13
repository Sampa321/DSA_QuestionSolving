package HomePractice.InfosysSpringBoard.WrapperClass;

public class Q2 {
    private static String checkString(String str){
        if(str == null)
        {
            return("NA");
        }
        int length = str.length();
        for(int ind = 0; ind < length/2; ind++)
        {
            if(str.charAt(ind) != str.charAt(length-1))
            {
                return("NA");
            }
        }
        return(str.substring(0,length/2) + str.charAt(length-1));
    }
    public static void main(String[] args) {
        String str1 = "LeveL";
        String res = checkString(str1);
        if(!res.equals("NA"))
        {
            String result = res.replace(res.charAt(0), 'z');
            System.out.println(result);
        }
        System.out.println();
    }
}
