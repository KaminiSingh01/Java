package java_string_pro;
import java.util.*;
public class count_vo_con {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        
        System.out.println("your string="+str.toLowerCase());
        int cv=0,cc=0;
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                cv++;

            }
            else if(str.charAt(i) == ' '){
                continue;
            }
            else{
                cc++;
            }
        }
        System.out.println("total number of vowel in string="+cv);
        System.out.println("total number of consonant in string="+cc);
    }
    
}
