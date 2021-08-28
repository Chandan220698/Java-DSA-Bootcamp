class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandy = Integer.MIN_VALUE;
        // boolean[] result = new boolean[candies.length]; // with this error
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        
        for(int i = 0;  i < candies.length; i++){
            boolean check = greatest(candies, candies[i]+extraCandies);
            list.add(check);
        }
        return list;
    }
    public boolean greatest(int[] candies, int candy){
        
        for(int i = 0;  i < candies.length; i++){
            if(!(candy >= candies[i])){
                return false;
            }
        }
        return true;
    }
}
