package java_string_pro;
import java.util.*;
public class dup_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your String=");
        String str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("ypur string="+str);
       
        String words[]=str.split(" ");
        int count;
        System.out.println("Duplicate words in your string:-");
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count>1&&words[i]!="0"){
                System.out.println(count+" times "+words[i]);
            }
        }
    }
}
