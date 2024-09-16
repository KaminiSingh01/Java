package Basic_program;
import java.util.*;
public class factorial_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        int num=sc.nextInt();
        int fact=1;
        int a=num;
        while(num!=0){
            fact*=num;
            num--;
        }
        System.out.println("Factorial of "+a+" = "+fact);
    }
}
