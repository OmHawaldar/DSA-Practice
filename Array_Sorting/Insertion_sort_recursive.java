import java.util.*;
class Main {
    
    
    static void inser(int[]arr,int i,int n){
        if(i==n){
            return;
        }
        int j=i;
        while(j>0&&arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        inser(arr,i+1,n);
    }
    public static void main(String[] args) {
        
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        inser(arr,0,n);
        System.out.print(Arrays.toString(arr));
        
    }
}
//Easy to understand just walkthrough once
