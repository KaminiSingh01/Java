class student{
    static String school;
    int id;
    String name;
    
}
public class static_prog {
    public static void main(String[] args){
        student.school="CMS";
        student s1=new student();
        student s2=new student();
        s1.id=101;
        s1.name="kamini";
        s2.id=102;
        s2.name="priya";
        System.out.println(s1.school);
        System.out.println(s2.school);
    }
}
