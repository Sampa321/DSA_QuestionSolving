package HomePractice.InfosysSpringBoard.WrapperClass;

public class Q4 {
   public static void main(String[] args) {
        String stringOne = "Sachin ";
        String stringTwo = "Tendulkar";
        String stringThree = stringOne.concat(stringTwo);
        String stringFour = new String("sachin tendulkar");
        String stringFive = stringThree.toLowerCase();
        if(stringFive.equals(stringFour))
        {
            System.out.println("Equal");
        } else if (stringThree == stringFour) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
       System.out.println(stringThree);
   }
}
