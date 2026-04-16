class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create hashMap along with finding the value.
        int[] result = new int[]{-1,-1};
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            int anotherElem=target-nums[i];
            if(numsMap.containsKey(anotherElem)){
                result[0]=numsMap.get(anotherElem);
                result[1]=i;
                return result;
            }

            if(!numsMap.containsKey(nums[i])){
                numsMap.put(nums[i],i);
            }

        }
        return result;

    }
}
