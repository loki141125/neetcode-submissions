class Solution {

    public String encode(List<String> strs) {
         StringBuilder str = new StringBuilder();
         for(String s : strs){
            int len = s.length();
            str.append(len).append("#").append(s);
         }
         return str.toString();
    }

    public List<String> decode(String str) {
       List<String> res = new ArrayList<>();
       int i = 0;
       while(i<str.length()){
         int j = str.indexOf("#",i);
         int length = Integer.parseInt(str.substring(i,j));
         res.add(str.substring(j+1,j+length+1));
         i=j+length+1;
       }
       return res;
    }
}
