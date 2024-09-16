package BASIC;
import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number to check palindrome:-");
        int n=sc.nextInt();
        int rem,p=0;
        int a=n;
        while(n!=0){
            rem=n%10;
            p=(p*10)+rem;
            n=n/10;
          
        }
        if(p==a){
            System.out.print("\n"+a+" is a palindrome number");
        }
        else{
            System.out.print("\n"+a+" is not a palindrome number");
        }
    }
}