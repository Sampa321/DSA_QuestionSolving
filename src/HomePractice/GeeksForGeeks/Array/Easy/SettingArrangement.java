package HomePractice.GeeksForGeeks.Array.Easy;
/*
Given an integer k representing the number of people to be seated and an array seats[], where 0 denotes an empty seat and 1 denotes an occupied seat.

Determine whether it is possible to seat all k people such that no two occupied seats are adjacent (including newly seated people).

Examples:

Input: k = 2, seats[] = [0, 0, 1, 0, 0, 0, 1]
Output: true
Explanation: The two people can sit at index 0 and 4.
Input: k = 1, seats[] = [0, 1, 0]
Output: false
Explanation: There is no way to get a seat for one person.
Input: k = 0, seats[] = [0, 0, 0, 1, 1]
Output: false
Explanation: The seating arrangement already contains two adjacent occupied seats at indices 3 and 4.
 */
public class SettingArrangement {
    public static void main(String[] args) {
       int k = 2;
       int []seats = {0, 0, 1, 0, 0, 0, 1};
        System.out.println(canSeatAllPeople(k, seats));
    }
    public static boolean canSeatAllPeople(int k, int[] seats) {
        int n = seats.length;
        int available_seats = 0;

        for (int i = 1; i < n; i++)
            if (seats[i] == seats[i - 1] && seats[i - 1] == 1) return false;

        for (int i = 0; i < n; i++) {
            int prev = i == 0 ? 0 : seats[i - 1];
            int next = i == n - 1 ? 0 : seats[i + 1];
            if (prev + next + seats[i] == 0) {
                available_seats++;
                i++;
            }
        }
        return available_seats >= k;
    }
}
