package Basic_program;
import java.util.*;
public class peri_area_rect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length=");
        int l=sc.nextInt();
        System.out.print("enter the breadth=");
        int b=sc.nextInt();
        int peri=2*(l+b);
        int area=l*b;
        System.out.println("perimeter of rectangle="+peri);
        System.out.println("Area of rectangle="+area);
    }
}
