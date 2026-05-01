package HomePractice.GeeksForGeeks.ProblemOfTheDay;

public class CheckIfAnArrayIsMaxHeap {
    public static void main(String[] args) {
        int []arr = {10, 15, 10, 7, 12, 11};
        System.out.println(isMaxHeap(arr) ? "Array is Max Heap" : "Array is not Max Heap");
    }
    public static boolean isMaxHeap(int[] arr) {
        // code here
        for(int i = 0; i < arr.length; i++)
        {
            if(leftChild(i) < arr.length && arr[leftChild(i)] > arr[i])
            {
                return false;
            }

            if(rightChild(i) < arr.length && rightChild(i) > arr[i])
            {
                return false;
            }

        }
        return true;
    }
    public static int leftChild(int i)
    {
        return (2*i+1);
    }
    public static int rightChild(int i)
    {
        return (2*i+2);
    }
}
