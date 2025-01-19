// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {


int []arr={3,4,-5,6,-8,-1,3,-12,7,-6,9};
int msum=Integer.MIN_VALUE;
int n=arr.length,sum=0,k=3;
for(int i=0;i<n-k;i++){
    sum=0;
    for(int j=i;j<i+k;j++){
        sum=sum+arr[i];
        if(sum>msum){
            msum=sum;
        }
    }
}


System.out.print(msum);

    }
}


*********************************************************************************************************************************************
    
class Solution {
    public int maxSubArray(int[] nums) {

        int n= nums.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int val=0;
                for(int k=i;k<=j;k++){
                    val += nums[k];
                }

              mx=Math.max(val,mx);
            }
        }
        return mx;

        
    }
}


*************************************************************************************************************************************************



Both are Brute force Approach, not suitable for varying and large test cases, optimal solution is given in Blind_75



    
