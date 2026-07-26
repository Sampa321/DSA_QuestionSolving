package HomePractice.DailyPractice.Practice;

import java.util.Scanner;
public class Stack1 {
    int top;
    int capacity;
    int []arr;


    Stack1(int c){
        this.top = -1;
        this.capacity = c;
        this.arr = new int[c];
    }

    boolean isEmpty(){
        return this.top == -1;
    }

    void push(int val)
    {
        if (this.top+1 == this.capacity)
        {
            System.out.println("Stack overflow!!");
            return;
        }
        this.arr[++this.top] = val;
    }

    int pop(){
        if (this.isEmpty())
        {
            System.out.println("Stack underflow!!");
            return Integer.MAX_VALUE;
        }
        return this.arr[this.top--];
    }

    int peek(){
        if (this.isEmpty())
        {
            System.out.println("Stack is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.arr[this.top];
    }

   public static void main(String[] args)
   {
       Stack1 st = new Stack1(4);
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       //st.pop();
       System.out.println(st.peek());;
       System.out.println(st.isEmpty());
   }


}
