class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max_length = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
            }

            map.put(current, i);

            max_length = Math.max(max_length, i - left + 1);
        }

        return max_length;
    }
}