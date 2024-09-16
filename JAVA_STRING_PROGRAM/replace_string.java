package String;
import java.util.*;
public class Replace_str {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String=");
        String str=sc.nextLine();
        String res="";
        System.out.println("Original String="+str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                res+='i';
            }
            else{
                res+=str.charAt(i);
            }
        }
        System.out.println("After removing e and replace it by i");
        System.out.println("Output="+res);
    }
}
