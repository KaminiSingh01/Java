package list;

public class selection_Sort {
    public static void main(String[] args){
        int[] arr={5,2,3,4,1};
        System.out.println("Array:-");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        int temp;
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        System.out.println("\nSorted Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
