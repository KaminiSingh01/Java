package pattern;
import java.util.*;
public class number_pat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of row=");
        int n=sc.nextInt();

        //upper part

        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //LOWER PART

        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

         //upper part

        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //LOWER PART

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //upper part

        for(int i=0;i<n;i++){
            int alp=64;
            for(int j=1;j<=n-i;j++){
                System.out.print((char)(alp+j)+" ");
            }
            System.out.println();
        }

        //LOWER PART
        
        for(int i=n-1;i>=0;i--){
            int alp=64;
            for(int j=1;j<=n-i;j++){
                System.out.print((char)(alp+j)+" ");
            }
            System.out.println();
        }

    }
    
}
