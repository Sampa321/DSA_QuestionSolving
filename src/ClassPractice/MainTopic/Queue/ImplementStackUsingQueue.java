package ClassPractice.MainTopic.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    ImplementStackUsingQueue(){
        queue1 = new PriorityQueue<>();
        queue2 = new PriorityQueue<>();
    }
    public void enqueue(int value){
        queue1.add(value);
        queue1.addAll(queue2);
        queue2.addAll(queue1);
        queue1.clear();
    }

    public int dequeue(){
        if(queue2.size() == 0)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return queue2.remove();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue  st = new ImplementStackUsingQueue();
        st.enqueue(10);
        st.enqueue(20);
        System.out.println(st.dequeue());
    }
}
