package ClassPractice.MainTopic.Queue;

import java.util.ArrayList;

public class ArrayListQueue {
    private ArrayList<Integer> list;
    public int front;
    public int rear;
    public int size;
    ArrayListQueue(){
        this.list = new ArrayList<>();
        this.rear = -1;
        this.front = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.front == -1;
    }

    public int getSize(){
        return this.size;
    }

    public int getFront(){
        if(this.front == -1)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.list.get(this.front);
    }

    public int getRear(){
        if(this.rear == -1)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.list.get(this.rear);
    }

    public void enqueue(int value){
        if(this.front == -1)
        {
            this.front = 0;
            this.rear = 0;
            return;
        }
        this.list.add(value);
        this.size++;
        this.rear++;
    }

    public void dequeue(){
        if(this.front == -1)
        {
            System.out.println("List is empty!!");
        }
        else {
            list.remove(this.front++);
            this.size--;
            this.front++;
        }
    }

    public static void main(String[] args) {
        ArrayListQueue qu = new ArrayListQueue();
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        // System.out.println("Size : "+qu.getSize());

        System.out.println("Rear : "+qu.getRear());
        System.out.println(qu.getFront());
        System.out.println("Empty : "+qu.isEmpty());
    }
}
