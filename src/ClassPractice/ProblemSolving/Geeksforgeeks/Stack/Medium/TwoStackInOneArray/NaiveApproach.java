package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.TwoStackInOneArray;

import java.util.Scanner;

/*
You are given an array of a fixed size. Your task is to efficiently implement two stacks in this single array.

The following operations must be supported:

(i) twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
(ii) push1(x) : pushes element into the first stack.
(iii) push2(x) : pushes element into the second stack.
(iv) pop1() : pops an element from the first stack and returns the popped element. If the first stack is empty, it should return -1.
(v) pop2() : pops an element from the second stack and returns the popped element. If the second stack is empty, it should return -1.

Examples:

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output: [3, 4, -1]
Explanation:
push1(2): the stack1 will be [2]
push1(3): the stack1 will be [2,3]
push2(4): the stack2 will be [4]
pop1(): the poped element will be 3 from stack1 and stack1 will be {2}
pop2(): the poped element will be 4 from stack2 and now stack2 is empty
pop2(): the stack2 is now empty hence returned -1.
Input:
push1(1)
push2(2)
pop1()
push1(3)
pop1()
pop1()
Output: [1, 3, -1]
Explanation:
push1(1): the stack1 will be [1]
push2(2): the stack2 will be [2]
pop1(): the poped element will be 1 from stack1 and stack1 will be empty
push1(3): the stack1 will be [3]
pop1(): the poped element will be 3 from stack1 and stack1 will be empty
pop1(): the stack1 is now empty hence returned -1.
Input:
push1(2)
push1(3)
push1(4)
pop2()
pop2()
pop2()
Output: [-1, -1, -1]
Explanation:
push1(2): the stack1 will be [2]
push1(3): the stack1 will be [2,3]
push1(4): the stack1 will be [2,3,4]
pop2(): the stack2 is empty hence returned -1.
pop2(): the stack2 is empty hence returned -1.
pop2(): the stack2 is empty hence returned -1.
 */
public class NaiveApproach {
    int []arr;
    int top1;
    int top2;
    int capacity;
    NaiveApproach(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity/2;
    }
    // Function to push an integer into the stack1.
    void push1(int x) {
        if(top1 == this.capacity/2)
        {
            System.out.println("Stack1 is full !!");
            return;
        }
        top1++;
        this.arr[this.top1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(this.top2 == capacity)
        {
            System.out.println("Stack2 is full");
            return;
        }
        this.arr[this.top2] = x;
        this.top2++;
    }

    // Function to remove an element from top of the stack1.

    int pop1() {
        if(this.top1 == -1)
        {
            return -1;
        }
        int result =  this.arr[this.top1];
        this.top1--;
        return result;
    }


    // Function to remove an element from top of the stack2.
    int pop2() {
        if(this.top2 == (arr.length/2)-1)
        {
            return -1;
        }
        this.top2--;
        return this.arr[this.top2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity : ");
        int capacity = sc.nextInt();
        NaiveApproach stack = new NaiveApproach(capacity);
//        stack.push1(2);
//        stack.push1(3);
//        stack.push2(4);
//        System.out.print(stack.pop1()+" ");
//        System.out.print(stack.pop2()+" ");
//        System.out.print(stack.pop2());


        stack.push1(1);
        stack.push1(2);;
         stack.push1(6);
         stack.push1(9);
    }
}
