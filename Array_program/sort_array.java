package Array_program;

public class sort_array {
    public static void main(String[] args){
        int[] arr={67,34,89,67,55,34,22,43,12,87,90};
        System.out.println("Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nSorted Array in Ascending Order:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSorted Array in Descending order:-");
        for(int k=arr.length-1;k>=0;k--){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}
