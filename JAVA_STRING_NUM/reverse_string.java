package java_string_pro;
import java.util.*;
public class reverse_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        String rev_string="";
        for(int i=str.length()-1;i>=0;i--){
            rev_string=rev_string+str.charAt(i);
        }
        System.out.println("your String="+str);
        System.out.println("your Reverse string="+rev_string);
    }
}
