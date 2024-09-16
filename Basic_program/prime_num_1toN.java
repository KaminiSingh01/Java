package Basic_program;
import java.util.*;
public class prime_num_1toN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:-");
        int n=sc.nextInt();
        System.out.println("Prime number from 1 to "+n);
        for(int i=2;i<=n;i++){
            int c=0;
            for(int j=2;j<i;j++)         {
                if(i%j==0){
                    c=1;
                    break;
                }
            }
            if(c==0){
                System.out.print(i+"\t");
            }
        }
    }
}
