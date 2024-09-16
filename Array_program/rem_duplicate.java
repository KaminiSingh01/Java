package Array_program;

public class rem_duplicate {
    public static void main(String[] args){
        int[] arr={54,34,76,34,66,23,54,77,56,54,19,77,56};
        int[] narr=new int[arr.length];
        int k=0;
        System.out.println("Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    
                }
            }
            if(count==0){
                narr[k++]+=arr[i];
                
            }
        }
        System.out.println("\nnew Array without duplicate element:-");
        for(int i=0;i<k;i++){
            System.out.print(narr[i]+" ");
        }
        System.out.println();
    }
}
