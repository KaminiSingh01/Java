package java_string_pro;
import java.util.*;
public class palindrome_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("your String is a Palindrome String");
        }
        else{
            System.out.println("your String is not Palindrome String.");
        }
    }
    
}
