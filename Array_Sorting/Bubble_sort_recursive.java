import java.util.*;
class Main{
    static void bub(int[] arr,int n){
       if(n==1){
           return;
       }
        int dswap=0;
        
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                dswap=1;
            }
        }
         if(dswap==0) {
             return;
         }
            bub(arr,n-1);
    }
    
    public static void main(String[]args){
        int[]arr={9,4,7,5,2,1,3};
        int n=arr.length;
        bub(arr,n);
        System.out.print(Arrays.toString(arr));
    }  
}
