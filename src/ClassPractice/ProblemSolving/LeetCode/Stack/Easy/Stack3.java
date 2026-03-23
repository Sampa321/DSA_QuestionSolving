package ClassPractice.ProblemSolving.LeetCode.Stack.Easy;

import java.util.ArrayList;

public class Stack3 {
    private final ArrayList<Character> list;

    Stack3()
    {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(char c){
        this.list.add(c);
    }

    public char pop(){
        if(list.isEmpty())
        {
            System.out.println("Arraylist is empty!!");
            return ' ';
        }
        char result = this.list.get(this.size()-1);
        this.list.remove(this.size()-1);
        return result;
    }

    public char peak(){
        if(list.isEmpty())
        {
            System.out.println("Arraylist is empty!!");
            return ' ';
        }
        return this.list.get(this.size()-1);
    }

    public int size(){
        return this.list.size();
    }

//    public static void main(String [] args) {
//        Stack3 stack = new Stack3();
//        System.out.println(stack.isEmpty());  //true
//        stack.push('a');
//        System.out.println(stack.pop());//'a'
//        System.out.println(stack.peak());  //error
//        System.out.println(stack.pop());   //error
//        System.out.println(stack.isEmpty()); //true
//        System.out.println(stack.size());  //0
//    }
}
