package java_string_pro;
import java.util.*;
public class div_str_npart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        int len=str.length();
        System.out.print("enter the value of n to divide the string=");
        int n=sc.nextInt();
        int temp=0,chars=len/n;
        String[] equalstr=new String[n];
        if(len%n !=0){
            System.out.println("your string can not be divide in equal part");

        }
        else{
            for(int i=0;i<len;i=i+chars){
                String part=str.substring(i,i+chars);
                equalstr[temp]=part;
                temp++;
            }
        
        System.out.println(n+" equal part of your string:");
        for(int i=0;i<equalstr.length;i++){
            System.out.println(equalstr[i]);
        }
        }
    }
    
}
