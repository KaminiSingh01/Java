package Array_program;

public class merge_two_array {
    public static void main(String[] args){
        int[] arr1={23,54,76,34,87,34,23};
        int[] arr2={2,34,67,4,56,23};
        int[] arr=new int[arr1.length+arr2.length];
        int k=0;
        System.out.println("Array 1:-");
        
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
            arr[k++]=arr1[i];
        }
        System.out.println("\nArray 2:-");
            for(int j=0;j<arr2.length;j++){
                arr[k++]=arr2[j];
                System.out.print(arr2[j]+" ");
            }
        System.out.println("\nNew Array after Merging Two array:-");
        for(int l=0;l<k;l++){
            System.out.print(arr[l]+" ");
        }
        System.out.println();
    }
    
}
