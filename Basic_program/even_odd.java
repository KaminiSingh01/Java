package Basic_program;
import java.util.*;
public class even_odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:-");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is a even number..");
        }
        else{
            System.out.println(a+" is a odd number..");
        }
    }
}
