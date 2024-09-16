package BASIC;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number:-");
        int n=sc.nextInt();
        int sum=1,i=n;
        while(i!=1){
            sum=sum*i;
            i--;
          

        }
        System.out.print("\nfactorial of"+n+" is "+sum);
    }
    
}
