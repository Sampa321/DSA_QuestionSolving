package HomePractice.GeeksForGeeks.String.Easy;
/*
There are n rooms in a straight line in Geekland State University's hostel. You are given a binary string s of length n, where s[i] = '1' means there is a WiFi router in the i-th room, and s[i] = '0' means there is no WiFi in that room.

Each WiFi router has a range of x, meaning it can cover up to x rooms to its left and x rooms to its right.

Given x and s, determine whether all rooms are covered by at least one WiFi router. Return true if all rooms are covered; otherwise, return false.

Examples:

Input: x = 0, s = "010"
Output: false
Explanation: Since the range is 0, so Wifi is only accessible in second room while 1st & 3rd room have no wifi. Therefore answer is false for this test case.
Input: x = 1, s = "10010"
Output: true
Explanation:
Index 0: WiFi is available.
Index 1: Since the range of the 0th index is 1, WiFi is available here.
Index 2: Since the range of the 3rd index is 1, WiFi is also available here.
Index 3: WiFi is available.
Index 4: The range of the 3rd index covers this position.
So, all the rooms have WiFi. Therefore, the answer is true for this test case.
 */
public class WifiRangeSolve {
    public static void main(String[] args) {
       String s = "10010";
       int x = 1;
       System.out.println(wifiRange(s,x));
    }
    public static boolean wifiRange(String s, int x) {
        // code here
        int cancover=0,iwant=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                cancover=x;
                iwant=0;
            }
            else
            {
                cancover--;
                if(cancover<0) iwant++;
                if(iwant>x) return false;
            }
        }
        if(iwant>0 || cancover<0) return false;
        return true;
    }
}
