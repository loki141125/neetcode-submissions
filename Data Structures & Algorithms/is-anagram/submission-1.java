class Solution {
    public boolean isAnagram(String s, String t) {
         int n = s.length();
         int m = t.length();
         if(n!=m) return false;
         char[] arr = s.toCharArray();
         char[] arr1 = t.toCharArray();
         HashMap<Character,Integer> map = new HashMap<>();
         HashMap<Character,Integer> map1 = new HashMap<>();
         for(int i = 0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
         }
         for(char ch : arr){
             if(!(map.get(ch).equals(map1.get(ch)))) return false;
         }
         return true;
    }
}
