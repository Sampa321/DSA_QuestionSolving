package HomePractice.GeeksForGeeks.Array.Basic;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;

/*
You are given an integer array arr[]. You need to insert the elements of arr into a TreeSet and display the results. Also, you need to erase a given element x from the TreeSet and print "erased x" if successfully erased, else print "not found".
Note: Don't add a new line in any function.

Examples:
Input: arr[] = [9, 8, 7, 4, 4, 2, 1, 1, 9, 8], x = 1
Output:
1 2 4 7 8 9
erased 1
2 4 7 8 9
Explanation: Initially TreeSet contains [1, 2, 4, 7, 8, 9]. 1 is present in the set, therefore prints "erased 1".Finally set contains [2, 4, 7, 8, 9].
Input: arr[] = [4, 2, 3, 3], x = 1
Output:
2 3 4
not found
2 3 4
Explanation: Initially TreeSet contains [2, 3, 4]. 1 is not present in the set so prints "not found". Finally set remains the same.

 */
public class TreeSetOperations {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tree set size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.print("Enter the check element : ");
        int checkEle = sc.nextInt();
        display(insert(arr));
        erase(insert(arr),checkEle);
        display(insert(arr));
    }
    public static TreeSet<Integer> insert(int arr[]) {
        // Your code here
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele:arr)
        {
            set.add(ele);
        }
        return set;
    }

    // Takes a TreeSet as an argument and prints
    // the elements of the TreeSet. The newline
    // is provided by the driver code.
    public static void display(TreeSet<Integer> s) {
        for(int i :s)
        {
            System.out.print(i+" ");
        }
        // Your code here
        System.out.println();
    }

    // Takes TreeSet and x as arguments and erases x
    // from the TreeSet. If erased, print "erased x"
    // else then print "not found".The newline
    // is provided by the driver code.


    public static void erase(TreeSet<Integer> s, int x) {
        // Your code here
        if(s.contains(x))
        {
            s.remove(x);
            System.out.println("erased "+x);

        }
        else{
            System.out.println("not found");
        }
    }
}
