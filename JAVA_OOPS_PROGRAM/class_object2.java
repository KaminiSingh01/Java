class Animal{
    String color;
    String name;
    public void janvar(){
        System.out.println("Animal Name:-"+this.name);
        System.out.println("Color of Animal:-"+this.color);
    }
}
public class class_object2 {
    public static void main(String[] args){
        Animal a1=new Animal();
        Animal a2=new Animal();
        Animal a3=new Animal();
        a1.color="Black-White";
        a1.name="Cow";
        a1.janvar();
        a2.color="Golden";
        a2.name="Lion";
        a2.janvar();    
        a3.color="Green";
        a3.name="Parrot";
        a3.janvar();

    }
}
