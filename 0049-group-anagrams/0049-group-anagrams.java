class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String sortstr=new String(c);
            mp.putIfAbsent(sortstr,new ArrayList<>());
            mp.get(sortstr).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
