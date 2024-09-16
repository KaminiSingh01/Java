package Project;
import java.util.*;
public class GuessingTheNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("--------------------GUESSING THE NUMBER GAME-------------------");
        System.out.println("........RULE:-You have five Chances to guess the number........");
       int w=0;
        int og=random.nextInt(10);
        for(int i=0;i<5;i++){
            System.out.print("enter your number=");
            int num=sc.nextInt();
            if(num>og){
                System.out.println("Your number is greater than original number");
            }
            else if(num<og){
                System.out.println("Your number is smaller than original number");
            }
            else{
                w=1;
                break;
            }
        }
        if(w==1){
            System.out.println("......Congratulation For Your Victory.....");
            System.out.println("................YOU WIN...................");
        }
        else{
            System.out.println("..........OOPS Sorry..........");
            System.out.println("...........YOU LOSE............");
            System.out.println("........Try Next Time..........");
            System.out.println("Original Number="+og);
        }
    }
}
