package ClassPractice.MainTopic.Queue;

import java.util.Scanner;

public class ArrayQueue {
    private final int []arr;
    private final int capacity;
    private int front;
    private int rear;
    private int size;
    ArrayQueue(int c){
        this.arr = new int[c];
        this.size = -1;
        this.capacity = c;
        this.front = -1;
        this.rear = -1;
    }
    public boolean isFull(){
        return this.size == this.capacity-1;
    }
    public boolean isEmpty(){
        return this.size == -1;
    }
    public int getSize(){
        return this.size+1;
    }
    public void dequeue(){
        if(this.size == -1)
        {
            System.out.println("Queue is empty!!");
            return;
        }
        this.arr[front++] = 0;
    }

    public void enqueue(int v){
        if(this.front == -1 && this.rear == -1)
        {
            this.front = 0;
            this.rear = 0;
            arr[this.front] = v;
            this.size++;
        }
        else if(this.capacity-1 == this.rear)
        {
            System.out.println("Queue is full !!");
        }
        else {
            arr[++this.size] = v;
            this.rear++;
        }

    }

    public int getFront(){
        if(this.front == -1)
        {
            System.out.println("Queue is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.arr[this.front];
    }

    public int getRear(){
        if(this.front == -1)
        {
            System.out.println("Queue is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.arr[this.rear];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity : ");
        int capacity = sc.nextInt();
        ArrayQueue qu = new ArrayQueue(capacity);
        qu.enqueue(10);
        qu.enqueue(10);
        System.out.println("hello");
        qu.enqueue(10);
        qu.dequeue();
        System.out.println("Size :"+qu.getSize());
        System.out.println("Full :"+qu.isFull());
        System.out.println("Front value :"+qu.getFront());
        System.out.println("Rear value :"+qu.getRear());
        System.out.println("Empty : "+qu.isEmpty());
    }
}
