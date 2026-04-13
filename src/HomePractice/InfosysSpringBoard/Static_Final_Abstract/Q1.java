package HomePractice.InfosysSpringBoard.Static_Final_Abstract;

public class Q1 implements GecOne,GecTwo{
    int noOfSystem,noOfClassRoom;
    public static void main(String[] args) {
        Q1 obj = new Q1();
        obj.setSystemNumber(10000);
        obj.getSystemNumber();
        obj.setNoOfClassRoom(450);
        obj.getNoOfClassRoom();
    }
    public void getNoOfClassRoom(){
        System.out.println(noOfClassRoom);
    }
    public void getSystemNumber(){
        System.out.println(noOfSystem);
    }
    public void setNoOfClassRoom(int noOfClassRoom){
        this.noOfClassRoom = noOfClassRoom;
    }
    public void setSystemNumber(int noOfSystem){
        this.noOfSystem = noOfSystem;
    }
}
