package com.company;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }

        }
        return counter;
    }
}
