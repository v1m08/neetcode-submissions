class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list = new HashMap<>();

        for(String s: strs) {
            int[] temp = new int[26];
            for(int j=0; j<s.length(); j++) {
                temp[s.charAt(j)-'a']++;
            }

            String key = Arrays.toString(temp);
            if(!list.containsKey(key)) {
                list.put(key, new ArrayList<>());
            }
            list.get(key).add(s);
        }

        return new ArrayList<>(list.values());
    }
}
