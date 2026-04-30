package HomePractice.GeeksForGeeks.ProblemOfTheDay;

import java.util.Stack;

public class BuildingWithSunlight {
   public static void main(String[] args) {
        int []arr = {6, 2, 8, 4, 11, 13};
        System.out.println(visibleBuildings(arr));
    }
    public static int visibleBuildings(int arr[]) {
        // code here
        Stack<Integer> st = new Stack<>();
        int c = 0;
        for(int i = 0; i < arr.length; i++)
        {
            while(!st.isEmpty() && st.peek() <= arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                c++;
            }
            st.push(arr[i]);
        }
        return c;
    }
}
