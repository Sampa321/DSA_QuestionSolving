package ClassPractice.MainTopic.Inheritance.MultilevelInheritance.Example1;

public class C extends B {
    int c;
    C(int a, int b, int c)  // a = 7, b = 8, c = 9
    {
        super(a, b); // call immediate parent constructor
        this.c = c;
    }
    void showC(){
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(this.c);
    }
}
