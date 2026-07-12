package ClassPractice.MainTopic.Sorting.HeapSort;

import java.util.Arrays;

public class MinHeap {
    int []heap;
    int capacity;
    int size;
    MinHeap(int c)
    {
        this.capacity = c;
        this.heap = new int[c];
        this.size = 0;
    }

    public int parent(int i){
        return (i-1)/2;
    }

    public int leftChild(int i)
    {
        return 2*i+1;
    }

    public int rightChild(int i)
    {
        return 2*i+2;
    }

    public void swap(int i, int j)
    {
        int temp = heap[i];
        heap[i] = this.heap[j];
        this.heap[j] = temp;
    }


    //For insert
    public void insert(int ele)
    {
        if(this.size == this.capacity)
        {
            System.out.println("Heap is full !!");
            return;
        }
        if(this.size == 0)
        {
            heap[0] = ele;
            this.size++;
            return;
        }
        this.heap[this.size] = ele;
        this.size++;
        heapifyUp(ele);
    }

    public void heapifyUp(int ele){
        int index = this.size-1;
        while (index != 0 && heap[parent(index)] > ele)
        {
            swap(index,parent(index));
            index = parent(index);
        }
    }

    //For delete
    public int getMin(){
        if(this.size == 0)
        {
            System.out.println("Heap is Empty!!");
            return Integer.MAX_VALUE;
        }
        int min = this.heap[0];
        swap(0, this.size-1);
        this.size--;
        heapifyDown(0);
        return min;
    }

    public void heapifyDown(int i)
    {
        int smallestElementIndex = i;
        int lcIndex = leftChild(i);
        int rcIndex = rightChild(i);
        if(lcIndex < this.size && heap[smallestElementIndex] > heap[lcIndex])
        {
            smallestElementIndex = lcIndex;
        }
        if(rcIndex < this.size && heap[smallestElementIndex] > heap[rcIndex])
        {
            smallestElementIndex = rcIndex;
        }
        if(smallestElementIndex != i)
        {
            swap(smallestElementIndex, i);
            heapifyDown(smallestElementIndex);
        }

    }

    public void traverse(){
        System.out.println(Arrays.toString(heap));
    }

   public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(6);
        minHeap.insert(23);
        minHeap.insert(12);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(14);
        minHeap.insert(16);
       System.out.println(minHeap.getMin());
       System.out.println(minHeap.getMin());
       System.out.println(minHeap.getMin());
       System.out.println(minHeap.getMin());
       System.out.println(minHeap.getMin());
       System.out.println(minHeap.getMin());
        minHeap.traverse();
    }
}
