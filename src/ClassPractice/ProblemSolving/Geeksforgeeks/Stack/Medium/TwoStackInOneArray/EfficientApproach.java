package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.TwoStackInOneArray;
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
public class EfficientApproach {
    int []arr;
    int top1;
    int top2;
    EfficientApproach() {
        arr = new int[100];
        top1 = -1;
        top2 = 100;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        top1++;
        this.arr[this.top1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        top2--;
        this.arr[this.top2] = x;
    }

    // Function to remove an element from top of the stack1.

    int pop1() {
        // code here
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
        // code here
        if(this.top2 == 100)
        {
            return -1;
        }
        int result =  this.arr[this.top2];
        this.top2++;
        return result;
    }
    static void main(String[] args) {
        EfficientApproach stack = new EfficientApproach();
//        stack.push1(1);
//        stack.push2(2);;
//        System.out.print(stack.pop1()+" ");
//        stack.push1(3);
//        System.out.print(stack.pop1()+" ");
//        System.out.print(stack.pop1());


        stack.push1(2);
        stack.push1(3);
        stack.push2(4);
        System.out.print(stack.pop1()+" ");
        System.out.print(stack.pop2()+" ");
        System.out.print(stack.pop2());
    }
}
