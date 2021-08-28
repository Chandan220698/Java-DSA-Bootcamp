class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];
        
        for(int i = 0;  i < nums.length;    i++){
            int j = index[i];
            list.add(j, nums[i]);
            System.out.println(list);
        }
        
        for(int i = 0;  i < nums.length;    i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}
