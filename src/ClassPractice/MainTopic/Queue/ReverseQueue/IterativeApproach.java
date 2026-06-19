package ClassPractice.MainTopic.Queue.ReverseQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeApproach {
    Stack<Integer> st;
    Queue<Integer> qu;
    IterativeApproach(){
        st = new Stack<>();
        qu = new LinkedList<>();
    }



    public void reverse(){
        while (!qu.isEmpty())
        {
            int ele = qu.remove();
            st.add(ele);
        }
    }

    public static void main(String[] args) {
        IterativeApproach queue = new IterativeApproach();

    }
}
