package Basic_program;
import java.util.*;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the principle=");
        int p=sc.nextInt();
        System.out.print("enter the rate=");
        int r=sc.nextInt();
        System.out.print("enter the time=");
        int t=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("Simple Interest="+si);
    }
}
