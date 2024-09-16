package BASIC;
public class fibonacci{
    public static void main(String[] args){
        System.out.println("fibonacci series");
        int a1=0,a2=1;
        System.out.print(a1+"\t"+a2);
        int i=0,n;
        while(i!=8){
            n=a1+a2;
            System.out.print("\t"+n);
            a1=a2;
            a2=n;
            i++;

        }

        
    }
}