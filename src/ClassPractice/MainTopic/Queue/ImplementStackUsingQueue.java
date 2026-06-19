package ClassPractice.MainTopic.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    ImplementStackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void enqueue(int value){
        queue1.add(value);
        queue1.addAll(queue2);
        queue2.clear();
        queue2.addAll(queue1);
        queue1.clear();
    }

    public int dequeue(){
        if(queue2.isEmpty())
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return queue2.remove();
    }

    public int getFront(){
        if(queue2.size() == 0)
        {
            System.out.println("Stack is empty!!");
            return -1;
        }
        return queue2.peek();
    }

    public int getRear(){
        if(queue2.size() == 0)
        {
            System.out.println("Stack is empty!!");
            return -1;
        }
        //return queue2.peek(queue2.size()-1);
        return 0;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue  st = new ImplementStackUsingQueue();
        st.enqueue(10);
        st.enqueue(20);
        st.enqueue(27);
        st.enqueue(50);
        st.enqueue(67);
        System.out.println(st.dequeue());
        System.out.println(st.getFront());
    }
}
