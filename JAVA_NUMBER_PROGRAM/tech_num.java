package java_number;
import java.util.*;
public class tech_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number=");
        int num=sc.nextInt();
        System.out.println("your number="+num);
        int digit=0,a=num;
        while(num!=0){
            digit++;
            num=num/10;
        }
        int first_half,second_half,total=0,sq;
        if(digit%2==0){
            first_half=a/(int)(Math.pow(10,digit/2));
            second_half=a%(int)(Math.pow(10,digit/2));
            total=first_half+second_half;
            sq=total*total;
            if(sq==a){
                System.out.println(a+" is a tech number");
            }
            else{
                System.out.println(a+" is not a tech number");
            }
        }
        else{
            System.out.println(a+" is not a tech number");
        }
    }
}
