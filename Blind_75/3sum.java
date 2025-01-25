class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n =arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

          for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
         

        return ans;

      
        
    }
}
