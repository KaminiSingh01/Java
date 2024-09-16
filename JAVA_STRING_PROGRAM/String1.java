package String;
public class String1 {
    public static void main(String[] args){
        String str1="Tony";
        String str2="Stark";
        String str=str1+" "+str2;
        System.out.println("String="+str);
        System.out.println("Length of String="+str.length());
        System.out.println("Each Character of a String:-");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("Subsstring of String="+str.substring(0,4 ));
        System.out.println("Substring of a String="+str.substring(5));
        String str12="123";
        int num=Integer.parseInt(str12);
        System.out.println(num);
        int num1=123;
        String str123=Integer.toString(num1);
        System.out.println(str123);
    }
    
}
