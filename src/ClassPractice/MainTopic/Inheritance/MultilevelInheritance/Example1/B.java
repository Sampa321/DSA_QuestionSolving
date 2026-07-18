package ClassPractice.MainTopic.Inheritance.MultilevelInheritance.Example1;

public class B extends A {
    int b;
    B(int a, int b){  //a = 7, b = 8
        super(a);   //call immediate parent constructor
        this.b = b;
    }
    void  showB(){
        System.out.println(super.a);
        System.out.println(this.b);
    }
}
