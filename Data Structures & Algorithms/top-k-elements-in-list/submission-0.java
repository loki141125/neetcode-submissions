class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>[] arr = new ArrayList[n+1];
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            int num = ent.getKey();
            int frq = ent.getValue();
             if(arr[frq] == null) {
                arr[frq] = new ArrayList<>(); 
            }
            arr[frq].add(num); 
        }
        int ind = 0;
        for(int i = arr.length-1;i>=0;i--){
              if (arr[i] != null) {
            for(int num:arr[i]){
                count[ind++] = num;
                if(ind==k) return count;
            }
        }}
        return count;
    }
}
