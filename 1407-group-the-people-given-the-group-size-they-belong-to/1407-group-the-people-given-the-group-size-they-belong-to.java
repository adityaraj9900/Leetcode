class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> groups=new HashMap<>();
        List<List<Integer>> result=new ArrayList<>();
        for (int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            List<Integer>group=groups.getOrDefault(size,new ArrayList<>());
            group.add(i);
            groups.put(size, group);
            if (group.size()==size) {
                result.add(group);
                groups.remove(size);
            }
        }
        return result;
    }
}
