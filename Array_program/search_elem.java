package Array_program;
import java.util.*;
public class search_elem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={4,2,6,22,55,75,13,33,59};
        System.out.print("enter the element to be search=");
        int ser=sc.nextInt();
        int f=1,pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ser){
                f=0;
                pos=i;
                break;
            }
        }
        if(f==0){
            System.out.println(ser+" is found in array at index "+pos);
        }
        else{
            System.out.println(ser+" is not found..");
        }
    }
}
