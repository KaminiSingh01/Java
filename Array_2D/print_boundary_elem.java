package Array_2D;

public class print_boundary_elem {
    public static void main(String[] args){
        int[][] A={{1,2,3,4},{5,6,7,8},{2,5,4,6},{9,8,7,6}};
        System.out.println("Matrix A:-");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Boundary Element in Matrix A:-");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==0||j==0||j==3||i==3){
                    System.out.print(A[i][j]+" ");
                }
            }
        }
       System.out.println();
    }
}
