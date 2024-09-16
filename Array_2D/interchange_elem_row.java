package Array_2D;

public class interchange_elem_row {
    public static void main(String[] args){
        int[][] A={{1,2,3,4},{5,6,7,8},{2,3,4,5},{8,7,6,5}};
        System.out.println("Matrix A:-");
        int[][] B=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(A[i][j]+" ");
                if(j==0||j==3){
                    B[i][0]=A[i][3];
                    B[i][3]=A[i][0];
                }
                else{
                    B[i][j]=A[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Matrix after interchanging first and last element across Row:-");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
