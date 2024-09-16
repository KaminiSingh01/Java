package Array_2D;

public class array2D_elem {
    public static void main(String[] args){
        int[][] arr={{1,2,1},{1,3,4},{1,5,6}};
        System.out.println("2D array:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
