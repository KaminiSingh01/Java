package list;

public class insertion_Sort {
    public static void main(String[] args){
        int[] arr={5,3,2,4,1};
        System.out.println("Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=1;i<arr.length;i++){
            int shift=arr[i];
            int j=i-1;
            while((j>-1)&&(arr[j]>shift)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=shift;
        }
        System.out.println("\nSorted Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
