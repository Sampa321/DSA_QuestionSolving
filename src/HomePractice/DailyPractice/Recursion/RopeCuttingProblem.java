package HomePractice.DailyPractice.Recursion;

public class RopeCuttingProblem {
    public static int ropeCut(int rope, int a, int b, int c)
    {
        if(rope == 0) return 0;
        if (rope < 0) return -1;
        int ropeA = ropeCut(rope-a, a, b, c);
        int ropeB = ropeCut(rope-b, a, b, c);
        int ropeC = ropeCut(rope-c, a, b, c);
        int maximumCut = Math.max(ropeC, Math.max(ropeA, ropeB));
        if (maximumCut == -1) return -1;
        return maximumCut+1;
    }
   public static void main(String[] args) {
        int n = 7;
        int a = 7, b = 2, c= 3;
       System.out.println(ropeCut(n, a, b, c));
    }
}
