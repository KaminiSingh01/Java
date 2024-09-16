package java_number;
import java.util.*;
public class peterson {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number=");
        int num=sc.nextInt();
        System.out.println("your number="+num);
        int rem,num1=num,i,sum=1,total=0;
        while(num!=0){
            rem=num%10;
            while(rem!=0){
                sum=sum*rem;
                
                rem--;
            }
            total=total+sum;
            sum=1;
            num=num/10;
            }
            System.out.println("total="+total);
            if(total==num1){
                System.out.println("your number is peterson number");

            }
            else{
                System.out.println("your number is not peterson number");
            }
        }
    }
    

