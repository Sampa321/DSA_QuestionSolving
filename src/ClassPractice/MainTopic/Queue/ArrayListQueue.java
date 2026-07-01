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
        return this.getSize() == 0;
    }

    public int getSize(){
        return this.size;
    }

    public int getFront(){
        if(this.getSize() == 0)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.list.get(this.front);
    }

    public int getRear(){
        if(this.getSize() == 0)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.list.get(this.rear);
    }

    public void enqueue(int value){
        if(this.getSize() == 0)
        {
            this.front = 0;
        }

        this.list.add(value);
        this.size++;
        this.rear++;
    }

    public void dequeue(){
        if(this.isEmpty())
        {
            System.out.println("Queue is empty!!");
            return;
        }
        list.remove(this.front);
        this.size--;
        this.rear--;
        if(this.size == 0)
        {
            this.front = -1;
            this.rear = -1;
        }
    }

    public static void main(String[] args) {
            ArrayListQueue qu = new ArrayListQueue();
            qu.enqueue(10);
            qu.enqueue(20);
            qu.enqueue(30);
            qu.dequeue();
            System.out.println("Size : "+qu.getSize());
           System.out.println("Rear : "+qu.getRear());
          System.out.println(qu.getFront());
          System.out.println("Empty : "+qu.isEmpty());
    }
}
