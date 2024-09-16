package list;
public class Bubble_Sort{
    public static void main(String[] args){
        int[] arr={5,3,4,2,1};
        System.out.println("Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}