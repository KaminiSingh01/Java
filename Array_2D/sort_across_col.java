package Array_2D;

public class sort_across_col {
    public static void main(String[] args){
        int[][] matA={{4,6,7,8},{8,9,4,5},{2,4,6,8},{1,2,3,4}};
        for(int i=0;i<matA.length;i++){
            for(int j=0;j<matA.length;j++){
               for(int k=0;k<matA.length;k++){
                if(matA[j][i]<matA[k][i]){
                    int temp=matA[j][i];
                    matA[j][i]=matA[k][i];
                    matA[k][i]=temp;
                }
               }
            }
        }
        System.out.println("Matrix A sorted Across Column:-");
        for(int i=0;i<matA.length;i++){
            for(int j=0;j<matA.length;j++){
                System.out.print(matA[i][j]+" ");
            }
            System.out.println();
        }
    }
}
