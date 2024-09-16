package Array_2D;

public class interchange_elem_column {
    public static void main(String[] args){
        int[][] A={{1,2,3,4},{4,5,6,7},{9,8,7,6},{3,2,4,5}};
        System.out.println("Matrix A:-");
        int[][] B=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(A[i][j]+" ");
                if(i==0||i==3){
                    B[0][j]=A[3][j];
                    B[3][j]=A[0][j];

                }
                else{
                    B[i][j]=A[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Matrix A after intechanging across column:-");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
