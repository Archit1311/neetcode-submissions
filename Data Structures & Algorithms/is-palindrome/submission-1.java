class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        

        boolean a = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                a = false;
                break;
            }
        }

        return a;
    }
}