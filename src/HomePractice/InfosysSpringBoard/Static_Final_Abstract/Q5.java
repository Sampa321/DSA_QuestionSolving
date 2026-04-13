package HomePractice.InfosysSpringBoard.Static_Final_Abstract;

public class Q5 {
    private int studentId;
    private int yearOfEnrollment;
    private static int counter1 = 2014101;
    private static int counter2 = 101;
    public Q5(int yearOfEnrollment){
        this.yearOfEnrollment = yearOfEnrollment;
        if (this.yearOfEnrollment == 2014)
        {
            this.studentId = counter1++;
        }
        else {
            this.studentId = counter2++;
        }
    }
    public static int totalNumberOfStudents(){
        return (Q5.counter2-101);
    }
    public static int totalNumberOfStudents2012(){
        return(Q5.counter1-2014100);
    }
   public static void main(String[] args) {
        Q5 obj = new Q5(2012);
       System.out.println(Q5.totalNumberOfStudents2012());
    }
}
