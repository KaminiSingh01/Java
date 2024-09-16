package BASIC;
public class pattern {
    public static void main(String[] args){
        System.out.println("....RIGHT PATTERN....");
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("....LEFT PATTERN");
        for(i=0;i<5;i++){
            for(j=2*(4-i);j>=0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pyramid Pattern");

        for(i=0;i<5;i++){
            for(j=5-i;j>1;j--){
                System.out.print(" ");

            }
            for(j=0;j<=i;j++){
                System.out.print("* ");

        }
            System.out.println();
        }
    }
    
}
