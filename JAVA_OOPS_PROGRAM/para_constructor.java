class cuboid{
    int l,b,h;
    cuboid(int len,int br,int hi){
        l=len;
        b=br;
        h=hi;       
    }
    public void display(){
        int V=l*b*h;
        System.out.println("volume of cuboid ="+V);
    }
}
class para_constructor{
    public static void main(String[] args){
        cuboid c1=new cuboid(2,3,4);
        c1.display();
    }
}