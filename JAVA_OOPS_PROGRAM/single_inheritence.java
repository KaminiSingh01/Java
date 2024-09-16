class shape{
    public void display(){
        System.out.println("Area Calculated...");
    }
}
class triangle extends shape{
    int h,b;
     triangle(int h,int b){
        int a=(h*b)/2;
        System.out.println("Area of Triangle="+a);
    }
}
public class single_inheritence {
    public static void main(String[] args){
    System.out.println("....SINGLE INHERITANCE....");
    triangle t1=new triangle(20,10 );
    t1.display();
    }
}
