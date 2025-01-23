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

import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,0,-4,5,0};
        int n=arr.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int prod=arr[i];
            for(int j=i+1;j<n;j++){                            *****************************
               prod*=arr[j];                                         BETTER APPROACH
                    if(prod>res){                              *****************************
                res=prod;
            }
                
            }
            
        }
        
     System.out.println(res);
    }
}

**********************************************************************************************************************************************


import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,0,-4,5,0};
        int n=arr.length;
        int p1=arr[0],p2=arr[0],res=arr[0];
        for(int i=1;i<n;i++){
         int temp =Math.max(arr[i],Math.max(p1*arr[i],p2*arr[i]));   *********************************
         p2=Math.min(arr[i],Math.min(p1*arr[i],p2*arr[i]));                OPTIMAL APPROACH
        p1= temp;                                                    **********************************
            res=Math.max(res,p1);
            
        }
        
     System.out.println(res);
    }
}







    
