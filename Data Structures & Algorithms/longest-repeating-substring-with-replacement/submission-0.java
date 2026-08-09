class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left =0;
        int max_freq=0;
        int max_length=0;

        for(int right=0;right<s.length();right++){
            char current = s.charAt(right);
            count[current-'A']++;
            max_freq = Math.max(max_freq,count[current-'A']);

        
            while(right-left+1-max_freq>k){
                count[s.charAt(left)-'A']--;
                left++;
        }
            max_length = Math.max(max_length,right-left+1);
        }

        return max_length;
    }
}
