package Array_string;

public class reverse_str {
    public static void main(String[] args){
        String str="kamini";
        System.out.println("Your String:-\n"+str);
        System.out.println("Reverse String:-");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
