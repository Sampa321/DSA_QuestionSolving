package ClassPractice.MainTopic.Matrix.Medium;

public class SpiralMatrix {

   public static void main(String[] args) {
        int [][]mat = {{1}, {2}, {3}, {4}};
        int L = 0;
        int R = mat[0].length-1;
        int B = mat.length-1;
        int T = 0;

        while (L <= R && T <= B)
        {
            for(int i = L; i <= R; i++)
            {
                System.out.print(mat[T][i] +" ");
            }
            T++;
            for(int i = T; i <= B; i++)
            {
                System.out.print(mat[i][R] +" ");
            }
            R--;
            if(T <= B)
            {
                for(int i = R; i >= L; i--)
                {
                    System.out.print(mat[B][i] +" ");
                }
                B--;
            }
            if(L <= R){
            for(int i = B; i >= T; i--)
            {
                System.out.print(mat[i][L] +" ");
            }
            L++;
        }
        }
    }
}
