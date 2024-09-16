package java_number;
import java.util.*;
public class reverse_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number=");
        int num=sc.nextInt();
        System.out.println("your number="+num);
        int i,new_num=0,rem;
        while(num!=0){
            rem=num%10;
            new_num=(new_num*10)+rem;
            num=num/10;
        }
        System.out.println("your reverse number="+new_num);
    }
    
}
