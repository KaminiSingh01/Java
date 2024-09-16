package java_string_pro;
import java.lang.reflect.Array;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your first string=");
        String str1=sc.nextLine();
        System.out.print("enter your second string=");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("your two string is not Anagram");
        }
        else{
            char[] string1=str1.toCharArray();
            char[] string2=str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1,string2)==true){
                System.out.println("strings are Anagram");
            }
            else{
                System.out.println("strings are not Anagram");
            }
        }
    }
    
}
