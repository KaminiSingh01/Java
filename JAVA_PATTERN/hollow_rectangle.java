package pattern;
import java.util.*;
public class hollow_rect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of row=");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==1||j==row||i==row||j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}
