class Solution {
     public boolean solve(int left, int right, int[] nums, int sp1, int sp2, boolean player1Turn) {

        if (left > right) {
            return sp1 >= sp2;
        }

        if (player1Turn) {
            return solve(left + 1, right, nums, sp1 + nums[left], sp2, false)
                || solve(left, right - 1, nums, sp1 + nums[right], sp2, false);
        } else {
            return solve(left + 1, right, nums, sp1, sp2 + nums[left], true)
                && solve(left, right - 1, nums, sp1, sp2 + nums[right], true);
        }
    }
    public boolean predictTheWinner(int[] nums) {
        return solve(0,nums.length-1,nums,0,0,true);
    }
}