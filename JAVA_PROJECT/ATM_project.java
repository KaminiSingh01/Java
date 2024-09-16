package Project;
import java.util.*;
public class ATM_project {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("------------A.T.M MACHINE-------------");
        System.out.println("Choose 1 for Withdrawal");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for Exit");
        System.out.println("............................................");
        int bal=50000;
        for(int i=0;i<10;i++){
            
            System.out.print("enter your Choice(1/2/3/4)=");
            int ch=sc.nextInt();
        do{
        
        if(ch==1){
            System.out.println("enter your Amount for withdrawal=");
            int amt=sc.nextInt();
                if(amt>bal){
                    System.out.println("Opps your Balance is too Low to Withdraw");
                }
                else{
                    System.out.println("Your Money is Withdrawn");
                    bal=bal-amt;
                }
            }
            else if(ch==2){
                System.out.println("enter your Amount to Deposit=");
                int amtD=sc.nextInt();
                bal+=amtD;
                System.out.println("Your Money is Deposited");
            }
            else if(ch==3){
                System.out.println("Balance="+bal);
            }
            else if(ch==4){
                break;
            }
            else{
                System.out.println("Invalid Choice......");
            }
            
            System.out.println(".....EXITING THE PROCESS.....");
               
        }while(ch==4);
        if(ch==4){
            break;
        }
    }
        System.out.println("...............THANKYOU FOR YOUR VISIT.............");
    }
}
