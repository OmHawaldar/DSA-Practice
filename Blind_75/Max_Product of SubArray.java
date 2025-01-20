import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        int [] arr={1,2,-3,0,-4,-5};
        int n=arr.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){                            *****************************
                int prod=1;                                     BRUTE FORCE APPROACH
                for(int k=i;k<=j;k++){                       *******************************
                    prod*=arr[k];
                    if(prod>res){
                res=prod;
            }
                }
            }   
        }
     System.out.println(res);    
    }
}
*******************************************************************************************************************************************
