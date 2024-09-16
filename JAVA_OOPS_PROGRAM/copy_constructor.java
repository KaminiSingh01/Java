class population{
    String name;
    int age;
    population(String n,int age){
        this.name=n;
        this.age=age;
    }
    population(population p){
        this(p.name,p.age);
        System.out.println(name+"  "+age);
    }
}
public class copy_constructor{
    public static void main(String[] args){
        population p1=new population("kamini",20);
        population p2=new population(p1);
        population p3=p2;
       // System.out.println(p2);

    }
}