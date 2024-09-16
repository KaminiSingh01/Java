package java_string_pro;
import java.net.SocketPermission;
import java.util.*;
public class replace_upper_lower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string=");
        String str=sc.nextLine();
        StringBuffer strnew=new StringBuffer(str);
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                strnew.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else{
                strnew.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
            
        }
        System.out.println("New String="+strnew);
    
    
    
    
    
    }

}
