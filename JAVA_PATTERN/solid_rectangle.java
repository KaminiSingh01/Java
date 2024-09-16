package pattern;
import java.util.*;
public class solid_rect {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)        ;  
        System.out.print("enter the number of row=");
        int row=sc.nextInt();
        for(int i=1;i<row;i++){
            for(int j=1;j<row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

