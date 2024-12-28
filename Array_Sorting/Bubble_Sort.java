import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        int []arr={12,9,56,78,38,1};
        int m=arr.length;
        for(int i=m-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.print(Arrays.toString(arr)+m);
    }
}


The outer loop starts from i = 5 (last index) and decreases by 1 in each iteration.
Purpose: Controls how many passes are made through the array.
After each pass, the largest element from the unsorted part of the array is moved to its correct position (bubbled up).

The inner loop iterates over the unsorted part of the array (from index 0 to i - 1).
Purpose: Compares adjacent elements and swaps them if they are out of order.
The largest unsorted element "bubbles up" to its correct position during each pass.

************************* SECOND APPROACH  *****************************************

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        int []arr={12,9,56,78,38,1};
        int m=arr.length;
        for(int i=m-1;i>=0;i--){
            int chk=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    chk=1;
                }
                if(chk==0){
                    break;
            }
        }
        System.out.print(Arrays.toString(arr)+m);
    }
}

just adding a check to avoid unnecssary swapping if array is already in ascending order





















    
