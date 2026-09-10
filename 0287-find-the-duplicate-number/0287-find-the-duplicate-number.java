class Solution {
    public int findDuplicate(int[] nums) {
     Map<Integer,Integer> mp=new HashMap<>();
     for(int ele:nums){
        mp.put(ele,mp.getOrDefault(ele,0)+1);
     }
     for(int ele:nums){
        if(mp.get(ele)>1){
            return ele;
        }
     }
     return -1;
    }
}