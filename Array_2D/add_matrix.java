package Array_2D;

public class add_matrix {
    public static void main(String[] args){
        int[][] a={{1,2},{3,4}};
        int[][] b={{5,6},{7,8}};
        int[][] sum=new int[a.length][a.length];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of Matrix A and B:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
