package Array_string;
import java.util.*;
public class replace_char_str {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="hello my name is samini singh";
        System.out.println("String:-"+str);
        System.out.print("enter the index from replacing character:-");
        int ind=sc.nextInt();
        System.out.print("enter the character:-");
        char ch=sc.next().charAt(0);
        
        StringBuilder string=new StringBuilder(str);
        string.setCharAt(ind, ch);
        
        System.out.println("New String after replacing character:-"+string);
    }
}
