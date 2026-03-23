package ClassPractice.MainTopic.Stack.BasicMethod;

import java.util.ArrayList;

public class Stack3 {
    private final ArrayList<Integer> list;

    Stack3()
    {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(int value){
        this.list.add(value);
    }

    public int pop(){
        if(list.isEmpty())
        {
            System.out.println("Arraylist is empty!!");
            return Integer.MAX_VALUE;
        }
        int result = this.list.get(this.size()-1);
        this.list.remove(this.size()-1);
        return result;
    }

    public int peak(){
        if(list.isEmpty())
        {
            System.out.println("Arraylist is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.list.get(this.size()-1);
    }

    public int size(){
        return this.list.size();
    }

    public static void main(String [] args) {
        Stack3 st = new Stack3();
        System.out.println(st.isEmpty());  //true
        st.push(99);
        st.push(23);
        st.push(29);
        st.push(89);
        System.out.println(st.pop());//89
        System.out.println(st.peak());  //29
        System.out.println(st.pop());  //29 because 29 is not deleted using peak()
        System.out.println(st.isEmpty()); //false
        System.out.println(st.size());  //2
    }
}
