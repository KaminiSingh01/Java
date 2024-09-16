package java_string_pro;
import java.util.*;
public class long_rep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        int len=str.length(),temp=0;
        char arr[]=new char[len];
        for(int i=0;i<len;i++){
            arr[i]=str.charAt(i);
        }
        System.out.println("array of character in string=");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("longest repition sequence of your string=");
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
          
        }
          System.out.println();
    }
    
}
