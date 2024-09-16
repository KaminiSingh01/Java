package java_string_pro;
import java.util.*;
public class string_rotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your first string=");
        String str1=sc.nextLine();
        System.out.print("enter your second string=");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.print("Second string is not a rotation of First string");
        }
        else{
            str1=str1.concat(str1);
            if(str1.indexOf(str2)!=-1){
                System.out.println("Second string is a rotation of First string");
            }
            else{
                System.out.println("Second string is not a rotation of First string ");
            }
        }
    }
    
}
