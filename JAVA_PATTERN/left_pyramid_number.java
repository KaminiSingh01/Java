package pattern;
import java.util.*;
public class left_py_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number of row=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
