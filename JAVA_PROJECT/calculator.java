package Project;
import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------CALCULATOR-------------------");
        System.out.print("enter your first number=");
        int num1=sc.nextInt();
        System.out.print("enter your second number=");
        int num2=sc.nextInt();
        System.out.print("enter the operator from (+,-,*,/)=");
        char op=sc.next().charAt(0);
        int res=0;
        switch(op){
            case '+':
             res=num1+num2;
             break;
            case '-':
             res=num1-num2;
             break;
            case '*':
             res=num1*num2;
             break;
            case '/':
             res=num1/num2;
             break;
            default:
             System.out.println("Invalid operator....");
        }
        System.out.println("Result of your operation="+res);
    }
}