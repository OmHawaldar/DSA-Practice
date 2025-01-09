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
