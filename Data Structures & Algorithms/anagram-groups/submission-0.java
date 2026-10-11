class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<List<Integer>,List<String>> map = new HashMap<>();
        for(String words : strs){
            Integer[] count = new Integer[26];
            Arrays.fill(count,0);
            for(char ch : words.toCharArray()){
                count[ch-'a']++;
        }
        List<Integer> key = Arrays.asList(count);
         if(map.containsKey(key)){
            map.get(key).add(words);
         }
         else{
            ArrayList<String> str = new ArrayList<>();
            str.add(words);
            map.put(key,str);
         }
        }
        return new ArrayList<>(map.values());
    }
}
