package Basic_program;
public class largest_among_3 {
    public static void main(String[] args){
        int a=23,b=56,c=28;
        System.out.println("Three Number:-"+a+","+b+","+c);
        if(a>b&&a>c){
            System.out.println(a+" is the Greatest Number..");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is the greatest Number..");
        }
        else{
            System.out.println(c+" is the Greatest Number..");
        }
    }
}
