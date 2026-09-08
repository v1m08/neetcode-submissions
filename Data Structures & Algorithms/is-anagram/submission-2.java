class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(first.get(c)==null) {
                first.put(c, 1);
            } else if(first.get(c)!=null) {
                first.put(c, first.get(c)+1);
            }
        }

        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(second.get(c)==null) {
                second.put(c, 1);
            } else if(second.get(c)!=null) {
                second.put(c, second.get(c)+1);
            }
        }

        if(first.equals(second)) {
            return true;
        }

        return false;
    }
}
