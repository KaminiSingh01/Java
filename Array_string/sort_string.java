package Array_string;
import java.util.*;
public class sort_string {
    public static void main(String[] args){
        String str="hello my name is kamini singh";
        char[] arr=str.toCharArray();
        System.out.println("Your String:-"+str);
        System.out.println("Sorted String:-"+String(Arrays.sort(arr)));
    }
    
}
