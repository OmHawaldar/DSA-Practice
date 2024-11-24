
    public int getSecondLargest(int[] arr) {
        
        int sm=Integer.MIN_VALUE, m=Integer.MIN_VALUE;
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                sm=m;
                m=arr[i];
            }else if(arr[i]>sm&&arr[i]!=m){
                sm=arr[i];
            }else if(sm==Integer.MIN_VALUE){
                sm=-1;
            }
        }
        
        return sm;
    }
