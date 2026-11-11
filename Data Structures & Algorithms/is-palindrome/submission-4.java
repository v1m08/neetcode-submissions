class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder rev + equals check
        
        StringBuilder rev = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) rev.append(c);
        }

        int l = 0, r = rev.length() - 1;

        while (l < r) {
            if (Character.toLowerCase(rev.charAt(l)) != Character.toLowerCase(rev.charAt(r))) return false;

            l++; r--;
        }

        return true;
    }
    
}
