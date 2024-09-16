package Array_program;

public class equal_array {
    public static void main(String[] args){
        int[] arr1={5,3,4,5,2};
        int[] arr2={5,1,3,2,4};
        if(arr1.length==arr2.length){
            int l=arr1.length;
            for(int i=0;i<l;i++){
                for(int j=i+1;j<l;j++){
                    if(arr1[i]>arr1[j]){
                        int temp1=arr1[i];
                        arr1[i]=arr1[j];
                        arr1[j]=temp1;
                    }
                    if(arr2[i]>arr2[j]){
                        int temp2=arr2[i];
                        arr2[i]=arr2[j];
                        arr2[j]=temp2;
                    }
                }
            }
            int ch=0;
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    ch=1;
                    break;
                }
            }
            if(ch==0){
                System.out.println("Both Array are equal..");

            }
            else{
                System.out.println("Both Array are not equal..");
            }
        }
        else{
            System.out.println("Both Array are not equal..");
        }
    }
}
