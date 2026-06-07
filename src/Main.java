public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat("food");
    }
}
class Animal{
   public void eat(){
       System.out.println("eating!!");
    }
}

class Dog extends Animal{
   public void eat(){
       System.out.println("ggg");
    }
   public void eat(String a){
       System.out.println(a);

    }
}