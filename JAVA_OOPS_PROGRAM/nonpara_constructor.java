class Student{
    int id;
    String name;
    Student(){
        System.out.println("...Information of Student...");
    }
    public void info(){
        System.out.println("...id:-"+id+"...");
        System.out.println("...name:-"+name+"...");
    }
}
public class nonpara_constructor {
    public static void main(String[] args){
        Student s1=new Student();       
        s1.id=1;
        s1.name="kamini";
        s1.info();
        Student s2=new Student();
        s2.id=2;
        s2.name="pratibha";
        
        s2.info();
    }
    
}
