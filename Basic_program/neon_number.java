package Basic_program;
import java.util.*;
public class neon_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check neon number=");
        int num=sc.nextInt();
        int sq_num=num*num;
        int sum=0;
        while(sq_num!=0){
            int rem=sq_num%10;
            sum+=rem;
            sq_num=sq_num/10;
        }
        if(sum==num){
            System.out.println(num+" is a neon number....");
        }
        else{
            System.out.println(num+" is not a neon number...");
        }

        
    }
}
