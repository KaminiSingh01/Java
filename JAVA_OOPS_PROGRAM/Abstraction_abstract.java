abstract class Animal{
    abstract void walk();
    void breathe(){
        System.out.println("it can breathe..");
    }
    Animal(){
        System.out.println("You are about to create an Animal...");
    }
}
class horse extends Animal{
    horse(){
        System.out.println("this is a horse..");
    }
    void walk(){
        System.out.println("it can walk on four leg..");
    }
}
class chicken extends Animal{
    chicken(){
        System.out.println("this is a chicken..");
    }
    void walk(){
        System.out.println("it can walk on two legs..");
    }
}
public class Abstraction_abstract {
    public static void main(String[] args){
        horse h1=new horse();
        h1.walk();
        chicken c1=new chicken();
        c1.walk();        
    }
}
