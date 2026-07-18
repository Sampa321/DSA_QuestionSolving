package ClassPractice.MainTopic.Inheritance.MultilevelInheritance.Example2;

public class A1 {
    int a;
    A1(){
        System.out.println("hello bhai!!");
    }
    A1(int a){ // no argument constructor
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
}
