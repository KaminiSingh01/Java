package Array_program;

public class largest_elem {
    public static void main(String[] args){
        int[] arr={6,34,86,23,89,11,17,78,98,34,55,101,43,66};
        System.out.println("Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int max=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println("\nMaximum element in Array:-"+max);
        
    }
    
}
