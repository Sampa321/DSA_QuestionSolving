package HomePractice.InfosysSpringBoard.WrapperClass;

public class Q3 {
   public static void main(String[] args) {
        String stringOne = "Java ";
        String stringTwo = "programming";
        String stringThree = stringOne.concat(stringTwo.substring(0,7).toUpperCase());
        stringThree.toLowerCase();
       System.out.println(stringThree.charAt(6));
    }
}
