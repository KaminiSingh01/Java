package BASIC;
import java.util.Scanner;
import java.lang.Math;
public class amstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number:-");
        int a=sc.nextInt();
        int digit=0,rem=0,sum=0,n=a,k=a;
        while(a!=0){
            a=a/10;
            digit++;
        }
        //System.out.println(digit);
        while(n!=0){
            rem=n%10;
            sum+=(Math.pow(rem,digit));
            n=n/10;

        }
      // System.out.println(sum);
        if(sum==k){
            System.out.print("\n"+k+" is a amstrong number");
        }
        else{
            
            System.out.print("\n"+k+" is not a amstrong number");
        }

    }
    
}
