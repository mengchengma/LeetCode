class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<List<Integer>> res = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> duplicate = new ArrayList<>();
            
            for (int key : map.keySet()) {
                int count = map.get(key);
                temp.add(key);
                count--;
                if (count == 0) {
                    duplicate.add(key);
                }
                map.put(key, count);
            }
            
            res.add(temp);
            for (int i : duplicate) {
                map.remove(i);
            }
        }
        return res;
    }
}