package Basic_program;
import java.util.*;
public class compound_interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the principle=");
        double p=sc.nextDouble();
        System.out.print("enter the rate=");
        double r=sc.nextDouble();
        System.out.print("enter the time=");
        double t=sc.nextDouble();
        double comp=p*(Math.pow((1+(r/100)), t));
        System.out.println("Compound Interest="+comp);
    }
}
