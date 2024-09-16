package java_string_pro;
import java.util.*;
public class count_punc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        System.out.println("your string="+str);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)=='!'||str.charAt(i)=='?'||str.charAt(i)=='\''||str.charAt(i)==':'||str.charAt(i)=='_'){
                count++;
            }
        }
        System.out.println("total number of punctuation in your string="+count);
    }
    
}
