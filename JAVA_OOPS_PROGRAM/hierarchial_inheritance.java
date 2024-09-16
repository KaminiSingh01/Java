class parent{
    public void display(String fname,String mname){
        System.out.println("Father Name:-"+fname+"\nMother Name:-"+mname);
    }
}
class child_1 extends parent{
    public void ch(String cname){
        System.out.println("Child Name:-"+cname);
    }
}
class child_2 extends parent{
    public void ch2(String name){
        System.out.println("Child Name:-"+name);
    }
}
public class hierarchial_inheritance {
    public static void main(String[] args){
        System.out.println(".....Hierarchial Inheritance....");
        child_1 c1=new child_1();
        child_2 c2=new child_2();
        System.out.println("....INFORMATION 1....");
        c1.display("Shyam Pratap Singh","Meena Singh");
        c1.ch("kamini Singh");
        
        System.out.println("....INFORMATION 2....");
        c2.display("Shyam Pratap Singh","Meena Singh");
        c2.ch2("Pratibha Singh");

    }
}
