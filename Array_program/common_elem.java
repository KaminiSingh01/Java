package Array_program;

public class common_elem {
    public static void main(String[] arg){
        String[] str1={"geek","for","geeks","article"};
        String[] str2={"article","for"};
        int l=str1.length,b=str2.length;
        String[] str=new String[l+b];
        int k=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                if(str1[i]==str2[j]){
                    str[k++]=str1[i];
                }
            }
        }
        System.out.print("Common Element in Both Array:-\n{ ");
        for(int i=0;i<k;i++){
            System.out.print(str[i]+" ");
        }
        System.out.print("}\n");
    }
}
