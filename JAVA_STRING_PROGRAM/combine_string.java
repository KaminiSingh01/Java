package String;
import java.util.*;
public class comb_str {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size =");
        int size=sc.nextInt();
        String[] arr=new String[size];
        int len=0;
        System.out.println("enter the string in array:-");
        for(int i=0;i<=size;i++){
            arr[i]=sc.nextLine();
            len+=arr[i].length();
        }
        System.out.println("Array of String:-");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nTotal Length of string in Array="+len);
    }
}
