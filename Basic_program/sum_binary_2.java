package Basic_program;
public class sum_binary_2 {
public static String add_binary(String x,String y){
    int i=x.length()-1,j=y.length()-1;
    int carry=0;
    StringBuilder res=new StringBuilder();
    while(i>=0 || j>=0){
        int sum=carry;
        if (i>=0){
            sum+=x.charAt(i)-'0';
        }
        if(j>=0){
            sum+=y.charAt(j)-'0';
        }
        if(sum==0||sum==1){
            res.append(sum);
            carry=0;
        }
        else if(sum==2){
            res.append("0");
            carry=1;
        }
        else{
            res.append("1");
            carry=1;
        }
        i--;
        j--;
    }
    if(carry==1){
        res.append("1");
    }
    return res.reverse().toString();
}
    public static void main(String[] args){
        String x="1001",y="1110";
        System.out.println(add_binary(x, y));
    }
    
}
