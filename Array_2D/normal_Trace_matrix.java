package Array_2D;

public class normal_Trace_matrix {
    public static void main(String[] args){
        int[][] A={{1,2,3},{4,5,6},{6,7,8}};
        System.out.println("Matrix A:-");
        int trace=0;
        double sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]+" ");
                if(i==j){
                    trace+=A[i][j];
                }
                sum+=A[i][j]*A[i][j];
            }
            System.out.println();
        }
        System.out.println("Trace of Matrix A:-"+trace);
        double nor=Math.sqrt(sum);
        System.out.println("Normal of MAtrix A:-"+nor);

    }
}
