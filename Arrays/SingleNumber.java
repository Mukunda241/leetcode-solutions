// LeetCode #136 - Single Number
// Difficulty: Easy
// Time: O(n)
// Space: O(1)

import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum = sum^i;
        }
        return sum;
    }
}