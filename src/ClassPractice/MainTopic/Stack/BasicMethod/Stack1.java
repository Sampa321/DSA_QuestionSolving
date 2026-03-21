package ClassPractice.MainTopic.Stack.BasicMethod;

import java.util.Scanner;

public class Stack1 {
    private final int []a;
    private int top;
    private final int capacity;

    Stack1(int capacity){
        this.a = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int value)
    {
        //Handle the overflow Problem
        if(this.top == (this.capacity-1))
        {
            System.out.println("Error : stack overflow(full) !! Can't push more elements into the stack.");
        }
        else {
            this.top++;
            this.a[this.top] = value;

        }
    }

    public int pop()
    {

        //Handle the Underflow Problem
        if(this.isEmpty())
        {
            System.out.println("Error : stack underflow(Empty) ! Can't pop element from the stack!!");
            return Integer.MAX_VALUE;
        }
        else {
            return this.a[top--];
        }

    }


    public int size(){
        return top+1;
    }

    public int peak(){
        if(this.isEmpty())
        {
            System.out.println("Error : stack underflow(Empty)! can't pop element from the stack!!");
            return Integer.MAX_VALUE;
        }
        return a[top];
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity : ");
        int capacity = sc.nextInt();
        Stack1 st = new Stack1(capacity);
        System.out.println(st.isEmpty()); //true
        System.out.println(st.capacity); //5
        st.push(89);
        st.push(56);
        st.push(23);
        st.push(12);
        st.push(7);
        st.push(63); //error
        System.out.println(st.pop()); //7
        System.out.println(st.peak()); //12
        System.out.println(st.size());
        System.out.println("Stack is  :");
        while (!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
}
