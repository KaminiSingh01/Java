package pattern;
import java.util.*;
public class hourglass {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of row=");
    int n=sc.nextInt();

    //UPPER PART

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*(n-i)+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //LOWER PART

    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*(n-i)+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

     //UPPER PART
    
    for(int i=1;i<=n;i++){
        int alp=64;
        for(int j=1;j<=i-1;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=2*(n-i)+1;j++){
            System.out.print((char)(alp+j)+" ");
        }
        System.out.println();
    }

    //LOWER PART

    for(int i=n-1;i>=1;i--){
        int alp=64;
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*(n-i)+1;j++){
            System.out.print((char)(alp+j)+" ");
        }
        System.out.println();
    }
}
}
