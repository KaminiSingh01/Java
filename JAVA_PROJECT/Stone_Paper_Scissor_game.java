package Project;
import java.util.*;
public class Stone_Paper_Scissor_game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("<--------------STONE/PAPER/SCISSOR--------------->");
        System.out.println("<-----RULE:- (1-Scissor) (2-Paper) (3-Rock)----->");
        int Scissor=1,rock=3,paper=2;
        System.out.println("enter your choice(1/2/3)=");
        int user=sc.nextInt();
        if(user==1){
            System.out.println("User Chose Scissor");
        }
        else if(user==2){
            System.out.println("User Chose Paper");
        }
        else if(user==3){
            System.out.println("User Chose Rock");
        }
        else{
            System.out.println("Invalid Choice");
        }
        int computer=random.nextInt(3);
        if(computer==1){
            System.out.println("Computer Chose Scissor");           
        }
        else if(computer==2){
            System.out.println("Computer Chose Paper");
        }
        else {
            System.out.println("Computer Chose Rock");
        }
        System.out.println("<---------RESULT--------->");
        if(computer==user){
            System.out.println(".....DRAW MATCH......");
        }
        else if((computer==1&&user==2)||(computer==2&&user==3)||(computer==3&&user==1)){
            System.out.println(".....COMPUTER WINS......");
        }
        else if(user>3){
            System.out.println(".........INVALID........");
        }
        else{
            System.out.println("......HORRAY!! YOU WINS......");
        }
    }
}
