package ClassPractice.MainTopic.Inheritance.MultilevelInheritance.Example2;

public class B1 extends A1 {
    int b;
    B1(){
        //super();   //Automatically call no argument parent class constructor if you call or not call.
        this.b = 30;
    }
    void show(){
        System.out.println(b);
    }
}
