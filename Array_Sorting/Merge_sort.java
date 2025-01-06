
/* Divide and merge technique, first the mergesort function divides the array recursively then the merge function sorts and merge the array 
  dont make mistakes in indexes, dividing calculating middle index and conditons in mergersort function*/

import java.util.*;
class Main {
     
   public static void merge(int[]arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
         
        while(left<=mid){
            temp.add(arr[left]);
                left++;
        }
        
        while(right<=high){
             temp.add(arr[right]);
                right++;
        }
        
        
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    
     public static void mergesort(int[]arr,int low,int high){
         if(low>=high){
             return;
         } 
             int mid=low+(high-low)/2;
             mergesort(arr,low,mid);
             mergesort(arr,mid+1,high);
             merge(arr,low,mid,high);
         
     }
   
    public static void main(String[] args) {
        int []arr={9,4,7,6,3,1,5};
        int n=arr.length,low=0,high=n-1;
       mergesort(arr,low,high);
       System.out.print(Arrays.toString(arr));
         
    }
    
}
