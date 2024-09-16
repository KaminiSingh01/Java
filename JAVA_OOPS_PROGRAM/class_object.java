
    class Name{
        String name;
        int id;
        public void display(){
            System.out.println("Your name is:"+this.name);
            System.out.println("Your id:"+this.id);
        }
    }
    class OOPs_CONCEPT{
    public static void main(String[] args){
        Name n1=new Name();
        n1.name="kamini singh";
        n1.id=100;
        n1.display();
        
    }
}