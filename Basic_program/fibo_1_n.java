package Basic_program;
import java.util.*;
public class fibo_1_n {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of N of Fibonacci Series:-");
        int max=sc.nextInt();
        int[] a=new int[max];
         a[0]=0;
         a[1]=1;
        System.out.println("Fibonacci Series:-");
        System.out.print(a[0]+" "+a[1]+" ");
        for(int i=2;i<max;i++){
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
           
        }
        int sum=0;
        System.out.println("\nEven Sum of Fibonacci Series till "+max);
        for(int j=0;j<max;j++){
            if(a[j]%2==0){
                sum+=a[j];
            }
        }
        System.out.println(sum);
    }
}
