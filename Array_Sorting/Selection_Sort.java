import java.util.*;
class Main {
    public static void main(String[] args) {

    int []arr={12,98,88,10,45,5};
    int n =arr.length;
    for(int i=0;i<n-1;i++){
        int m=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[m]){
                m=j;
            }
        }
            int temo=arr[i];
            arr[i]=arr[m];
            arr[m]=temo;
        
    }
System.out.print(Arrays.toString(arr));
    
    }
}

// Two loops one for parsing and swapping another for finding min value
// loop
// parse > find min value > swap with start position > 
// end
