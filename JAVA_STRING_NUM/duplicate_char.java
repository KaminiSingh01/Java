package java_string_pro;
import java.util.*;
public class duplicate_char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        System.out.println("your string="+str);
        int count;
        char str_new[]=str.toCharArray();
        System.out.println("Duplicate String:-");
        for(int i=0;i<str_new.length;i++){
            count=1;
            for(int j=i+1;j<str_new.length;j++){
                if(str_new[i]==str_new[j]&& str_new[i]!=' '){
                    count++;
                    str_new[j] ='0';
                }
            }
            if(count>1&&str_new[i]!='0'){
                System.out.println(count+" times "+str_new[i]);
            }
        }



    }
}
