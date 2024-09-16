package Basic_program;
public class lcm_2_num {
    public static void main(String[] args){
        int a=30,b=25;
        System.out.println("Two Number:-"+a+","+b);
        int ans=(a>b)?a:b;
        while(true){
            if(ans%a==0&&ans%b==0)
                break;
            ans++;
        }
        System.out.println("L.C.M of "+a+" and "+b+"="+ans);
    }
}
