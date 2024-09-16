package Array_2D;

public class Transpose {
    public static void main(String[] args){
        int[][] A={{1,2},{2,3},{5,6},{7,8}};
        System.out.println("Matrix A:-");
        int[][] T=new int[2][4];
        int k=0,l=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
                
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                T[i][j]=A[j][i];
            }
         
        }
        System.out.println("Transpose of Matrix A:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }
}
