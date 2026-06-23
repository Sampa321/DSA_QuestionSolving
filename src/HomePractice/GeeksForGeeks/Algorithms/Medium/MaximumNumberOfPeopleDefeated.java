package HomePractice.GeeksForGeeks.Algorithms.Medium;
/*
There are infinitely many people standing in a row, indexed from 1. The strength of the person at index i is i².

Given a strength p, determine the maximum number of people that can be defeated. A person with strength x can be defeated only if p ≥ x, after which the strength p decreases by x.

Examples :

Input: p = 14
Output: 3
Explanation: The strengths of the first few people are 1, 4, 9, 16, .... Defeating the first three people consumes 1 + 4 + 9 = 14 strength, leaving 0. Therefore, the maximum number of people that can be defeated is 3.
Input: p = 10
Output: 2
Explanation: After defeating people with strengths 1 and 4, the remaining strength is 5, which is less than the next required strength 9.
 */
public class MaximumNumberOfPeopleDefeated {
    public static void main(String[] args) {
        int p = 14;
        System.out.println(maxPeopleDefeated(p));
    }
    public static int maxPeopleDefeated(int p) {
        // code here
        int re = 0;
        for(int i = 1; i <= p; i++)
        {
            int square = i*i;
            re += square;
            if(re == p)
            {
                return i;
            }
            else if(re > p) return i-1;
        }
        return -1;
    }
}
