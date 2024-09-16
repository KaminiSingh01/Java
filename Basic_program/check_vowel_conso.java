package Basic_program;
import java.util.*;
public class check_vowel_conso {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the character=");
        char ch=sc.next().charAt(0);
        //ch=ch.toLowerCase();
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(ch+" is a vowel character..");
        }
        else{
            System.out.println(ch+" is a consonant character..");
        }
    }
}
