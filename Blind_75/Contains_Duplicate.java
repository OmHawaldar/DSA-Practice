// # check if a value appears atleast twice
// Approach 1, simple two loops

class Main {

    public static boolean dup(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
                }
            }
            return false;
            
        }
    
    public static void main(String[] args) {
        
        int[] arr={1, 2, 3, 4,5,7,8,89,7,64,6};
        boolean res=dup(arr);
        System.out.print(res);

    }
}


********************************************************************************************************************************************************************************************************


// Approach 2, first sort the array then comapre it's neighbour elements to check duplicate


import java.util.*;

class Main {
    
    public static boolean dup(int[]arr){
        int n=arr.length;
        Arrays.sort(arr);
        
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int []arr={1,2,5,6,2};
        
        boolean res=dup(arr);
        System.out.print(res);
       
    }
}


********************************************************************************************************************************************************************************************************



// Approach 3 Using HashSet, HashSet does not accept duplicate values we can use this to check for duplicates
//     easy to understand


import java.util.*;

class Main {
    
    public static boolean dup(int[]arr){
        int n=arr.length;
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        if(set.size()<n){                                             **********************************
                                                                        3rd APPROACH USING HASHSET
        return true;                                                  ************************************
    }
    return false;
    }
    public static void main(String[] args) {   
        int []arr={1,2,5,6};
        boolean res=dup(arr);
        System.out.print(res);
       
    }
}
