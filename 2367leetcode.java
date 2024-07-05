class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] umesh = new boolean[350];
        for (int u : nums) {
            umesh[u] = true;
        }
        int ans = 0;
        for (int u : nums) {
            if (umesh[u + diff] && umesh[u + diff + diff]) {
                ++ans;
            }
        }
        return ans;
    }
}
