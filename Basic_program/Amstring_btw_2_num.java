package Basic_program;
import java.util.*;
public class Amstring_btw_2_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting number=");
        int a=sc.nextInt();
        System.out.println("enter the ending number=");
        int b=sc.nextInt();
        System.out.println("Amstrong between "+a+" and "+b);
        for(int i=a+1;i<b;i++){
            int digit=0;
            int num=i,numc=i;

            while ( numc!=0){
                 numc=numc/10;
                 digit++;                
            }

            int am=0;

            while(num!=0){
                int r=num%10;
                am+=Math.pow(r, digit);
                num=num/10;
            }

            if(am==i){
                System.out.print(i+" ");
            }
            
        }
        System.out.println();
    }
}
