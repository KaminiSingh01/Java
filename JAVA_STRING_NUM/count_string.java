package java_string_pro;
import java.util.*;
public class count_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String st=sc.nextLine();
        int i,count=0;
        for(i=0;i<st.length();i++){
            if(st.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of Character in your string:"+count);
    }
    
}
