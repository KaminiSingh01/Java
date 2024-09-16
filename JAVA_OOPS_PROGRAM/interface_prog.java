interface  Animal{
    void walk();
}
class horse implements Animal{
    public void walk(){
        System.out.println("Horse can walk on four leg..");
    }
}
class chicken implements Animal{
    public void walk(){
        System.out.println("Chicken can walk on two legs..");
    }
}
public class interface_prog {
    public static void main(String[] args){
        horse h1=new horse();
        h1.walk();
    
        chicken c1=new chicken();
        c1.walk();
    }

}
