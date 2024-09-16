package pattern;
import java.util.*;
public class num_py {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of row=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }
}
