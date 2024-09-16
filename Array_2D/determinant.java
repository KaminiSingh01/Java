package Array_2D;

public class determinant {
    public static void main(String[] args){
        int[][] A={{1,2},{3,4}};
        int det=0;
        int mul=1;
        int mul2=1;
        System.out.println("Matrix A:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if((i==0&&j==0)||(i==1&&j==1)){
                    mul*=A[i][j];
                }
                else{
                    mul2*=A[i][j];
                }
            }
        }
        det=mul+mul2;
        System.out.println("Determinant of Matrix A:-"+det);
    }
}
