package pattern;
import java.util.*;
public class diamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number of row=");
        int n=sc.nextInt();

        //upper part

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        //lower part

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }


    }
}
