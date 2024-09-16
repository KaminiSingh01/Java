package Basic_program;
class complex_add{
    int real,imag;
    complex_add(int r,int i){
        this.real=r;
        this.imag=i;
    }
    public void showc(){
        System.out.println(this.real+"+i"+this.imag);
    }
    public static complex_add addc(complex_add n1,complex_add n2){
        complex_add res=new complex_add(0,0);
        res.real=n1.real+n2.real;
        res.imag=n1.imag+n2.imag;
        return res;
    }
    public static void main(String[] args){
        complex_add c1=new complex_add(3,2);
        complex_add c2=new complex_add(2,5);
        System.out.print("First complex number:-");
        c1.showc();
        System.out.print("\nSecond complex number:-");
        c2.showc();
        complex_add res=addc(c1, c2);
        System.out.print("\nAddition of two Complex Number:-");
        res.showc();
    }
}


    

