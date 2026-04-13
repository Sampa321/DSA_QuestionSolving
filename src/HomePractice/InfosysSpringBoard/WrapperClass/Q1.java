package HomePractice.InfosysSpringBoard.WrapperClass;

public class Q1 {
   public static void main(String[] args) {
        String stringOne = "Java ";
        String stringTwo = "programming";
        String stringThree = stringOne.concat(stringTwo);
        String stringFive = stringThree.replace('a','A');
        String stringFour = new String("JAva programming");
        if(stringFive.equals(stringFour))
        {
            System.out.println("Equal");
        } else if (stringThree == stringFour) {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
       System.out.println(stringFive);
   }
}
