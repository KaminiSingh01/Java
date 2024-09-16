package Array_program;

public class copyAarr_Barr {
    public static void main(String[] args){
        int[] a={3,2,4};
        int[] b=new int[a.length];
        int k=0;
        System.out.println("Array A:-");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            b[k++]=a[i];
        }
        System.out.println("\nArray B Copied from Array A:-");
        for(int i=0;i<k;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        
    }
    
}
