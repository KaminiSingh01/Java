package Basic_program;

public class sum_two_binary_string {
    static String add_binary(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        return result;

    }
    public static void main(String[] args){
        String x="1011",y="1001";
        System.out.println(add_binary(x,y));
    }
}
