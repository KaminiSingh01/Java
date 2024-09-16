package java_number;
import java.util.*;
public class automorphic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number=");
        int num=sc.nextInt();
        System.out.println("your number="+num);
        int n_num=0,i,digit=0,a=num;
        while(num!=0){
            digit++;
            num=num/10;
          
        }
        int sq=a*a;
        n_num=(int)(sq%(Math.pow(10, digit)));
        System.out.println("your number square="+sq);
        if(a==n_num){
            System.out.println("your number is automorphic");
        }
        else{
            System.out.println("your number is not automorphic");
        }
    }
    
}
