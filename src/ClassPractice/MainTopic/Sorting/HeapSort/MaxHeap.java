package ClassPractice.MainTopic.Sorting.HeapSort;

import java.util.Arrays;

public class MaxHeap {
    int []heap;
    int capacity;
    int size;
    MaxHeap(int c){
        this.capacity = c;
        this.heap = new int[c];
        this.size = 0;
    }

    public static int parent(int i)
    {
        return (i-1)/2;
    }

    public static int leftChild(int i)
    {
        return 2*i+1;
    }

    public static int rightChild(int i)
    {
        return 2*i+2;
    }


    //For insert
    public void insert(int ele)
    {
        if(this.capacity == this.size)
        {
            System.out.println("Heap is full!!");
            return;
        }
        if(this.size == 0)
        {
            this.heap[0] = ele;
            this.size++;
            return;
        }
        this.heap[this.size] = ele;
        int index = this.size;
        this.size++;
        heapifyUp(ele);
    }

    public void heapifyUp(int ele){
        int index = size-1;
        while (index != 0 && heap[parent(index)] < ele)
        {
            swap(parent(index), index);
            index = parent(index);
        }
    }


    public void swap(int i, int j)
    {
        int temp = heap[i];
        heap[i] = this.heap[j];
        heap[j] = temp;
    }

    //For deletion
    public int getMax(){
        if(size == 0)
        {
            System.out.println("Heap is empty!!");
            return Integer.MAX_VALUE;
        }
        int max = this.heap[0];
        this.swap(0, this.size-1);
        this.size--;
        heapifyDown(0);
        return max;
    }

    public void heapifyDown(int i)
    {
        int largestElementIndex = i;
        int lcIndex = leftChild(i);
        int rcIndex = rightChild(i);
        if(lcIndex < size && heap[lcIndex] > heap[largestElementIndex])
        {
            largestElementIndex = lcIndex;
        }
        if(rcIndex < size && heap[rcIndex] > heap[largestElementIndex])
        {
            largestElementIndex = rcIndex;
        }
        if(largestElementIndex != i)
        {
            swap(largestElementIndex, i);
            heapifyDown(largestElementIndex);
        }
    }


    public  void traverse(){
        System.out.println(Arrays.toString(this.heap));
    }

    public static void main(String[] args) {
         MaxHeap obj = new MaxHeap(5);
         obj.insert(10);
         obj.insert(30);
         obj.insert(90);
         obj.insert(60);
         obj.insert(70);
        System.out.println(obj.getMax());
        System.out.println(obj.getMax());
        System.out.println(obj.getMax());
        System.out.println(obj.getMax());
        System.out.println(obj.getMax());
         obj.traverse();
        System.out.println(obj.size);
    }
}
