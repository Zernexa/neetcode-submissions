class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());

        entryList.sort((a,b) -> b.getValue() - a.getValue());

        int[] results = new int[k];

        for (int i = 0; i < k; i++){
            results[i] = entryList.get(i).getKey();
        }

        return results;
    }
}
