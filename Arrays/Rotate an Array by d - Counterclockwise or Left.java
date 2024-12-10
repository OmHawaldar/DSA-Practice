// Brute force approach
import java.util.*;
class Main {
    public static void main(String[] args) {
        
    int []arr={1,2,3,4,5};
    int n=arr.length;
    int d=2;
    for(int j=0;j<d;j++){
        
    int temp=arr[0];
    
    for(int i=0;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    arr[n-1]=temp;
        
    }
    
    System.out.println(Arrays.toString(arr));
        
    }
}


//Optimal Approach
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    
    
     static void reverse(int[]arr,int start,int end){
         while(start<end){
              int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
               
         }
   
        
    }
    
    public static void main(String[] args) {
        int []arr={45,78,79,88,12};
        int n=arr.length;
        
        int d=10;
        d%=n;
        
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
        System.out.println(Arrays.toString(arr));
 
}


}

