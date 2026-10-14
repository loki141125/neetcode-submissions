class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(String words : strs){
            char[] charArray = words.toCharArray();
            Arrays.sort(charArray);
            String word = new String(charArray);
            if(map.containsKey(word)){
                map.get(word).add(words);
            }
            else{
                List<String> li = new ArrayList<>();
                li.add(words);
                map.put(word,li);
            }

        }
        return new ArrayList<>(map.values());
    }
}
