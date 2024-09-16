package java_string_pro;
import java.util.*;
public class rem_whitespace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        str=str.replaceAll("\\s+", "");
        System.out.println("Removing all Whitespace="+str);           
    }
    
}
