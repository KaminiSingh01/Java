package Array_program;
import java.util.*;
public class rem_occur_elem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={34,5,4,2,54,2,3,6,3,6,76,3,3,23,3};
        System.out.print("enter the key value to remove=");
        int key=sc.nextInt();
        int roccur[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=key){
                roccur[k++]=arr[i];
            }
        }
        System.out.println("After removing the key value from array:-");
        for(int i=0;i<k;i++){
            System.out.print(roccur[i]+" ");
        }
        System.out.println();

    }
    
}
