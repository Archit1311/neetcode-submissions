class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            String str = strs[i];
            int count[] = new int[26];
            for(char c: str.toCharArray()){
                count[c-'a']++;
            
            }
            StringBuilder sb = new StringBuilder();
            for(int j =0;j<26;j++){
                    sb.append('0');
                    sb.append(count[j]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
