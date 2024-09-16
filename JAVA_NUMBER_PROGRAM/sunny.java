package java_number;
import java.util.*;
public class sunny {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number=");
        int num=sc.nextInt();
        System.out.println("your number="+num);
        if((boolean)(Math.sqrt(num+1)%1==0)){
            System.out.println("your number is sunny number");

        }
        else{
            System.out.println("your number is not sunny number");
        }

    }
    
}
