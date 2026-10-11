class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i = 0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>1) return true;
         }
         return false;
    }
}