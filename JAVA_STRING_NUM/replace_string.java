package java_string_pro;
import java.util.*;
public class replace_string {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your string=");
    String str=sc.nextLine();
    char ch='-';
    System.out.println("your string="+str);
    System.out.println("new String with your special character="+str.replace(' ',ch));
    
}
}