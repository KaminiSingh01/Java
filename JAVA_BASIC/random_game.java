package BASIC;
import java.util.*;
public class random_game{
    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("GUESSING THE NUMBER GAME.......");
        int a=r.nextInt(100);
        System.out.println("you have five chance to guess the number.");
        int i=0,num=0;
        while(i!=5){
        System.out.print("enter your number between(1-100):");
        num=sc.nextInt();
        if(num==a){
            break;
        }
        else if(num>a){
            System.out.println("Your number is greater than actual number..");
        }
        else{
            System.out.println("your number is lesser than actual number..");
        }
        i++;
    }
    if (num==a){
        System.out.println("\nCongrulation\n You guess it right\nYou won the Game");
    }
    else{
        System.out.println("\nOOPs TRY next time");
    }

    }
}