package ClassPractice.MainTopic.Queue;

import java.util.Scanner;

public class ArrayQueue {
    private int []arr;
    private int capacity;
    private int front;
    private int rear;
    private int size;
    ArrayQueue(int c){
        this.arr = new int[c];
        this.size = 0;
        this.capacity = c;
        this.front = -1;
        this.rear = -1;
    }
    public boolean isFull(){
        return this.size == this.capacity;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public int getSize(){
        return this.size;
    }
    public void dequeue(){
        if(this.size == 0)
        {
            System.out.println("Queue is empty!!");
            return;
        }
        this.arr[front++] = 0;
        this.size--;
    }

    public void enqueue(int v){
        if(this.getSize() == 0)
        {
            this.front = 0;
            this.rear = 0;
            arr[this.size] = v;
            this.size++;
        }
        else if(this.isFull())
        {
            System.out.println("Queue is full !!");
        }
        else {
            this.rear++;
            arr[this.size] = v;
            this.size++;
        }

    }

    public int getFront(){
        if(this.getSize() == 0)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.arr[this.front];
    }

    public int getRear(){
        if(this.getSize() == 0)
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.arr[this.rear];
    }

    public static void main(String[] args) {
        System.out.print("Enter the capacity : ");
        int capacity = 3;
        ArrayQueue qu = new ArrayQueue(capacity);
        qu.enqueue(10);
        qu.enqueue(20);
        System.out.println("hello");
        qu.enqueue(30);
        qu.dequeue();
        System.out.println("Size : "+qu.getSize());
        System.out.println("Full : "+qu.isFull());
        System.out.println("Front value : "+qu.getFront());
        System.out.println("Rear value : "+qu.getRear());
        System.out.println("Empty : "+qu.isEmpty());
    }
}
