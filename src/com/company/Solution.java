package com.company;

class Solution {
    public int[] buildArray(int[] nums) {
        int size=nums.length;
        for(int i=0;i<nums.length;i++)
            nums[i]+=(nums[nums[i]]%size)*size;
        for(int i=0;i<nums.length;i++)
            nums[i]/=size;
        return nums;
    }
}