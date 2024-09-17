package com.junebatch.corejava.test;

public class TestCode {


    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        removeElement(arr, 2);
    }

    public static int removeElement(int[] nums, int val) {

        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (j <= i) j = i + 1;
                while (j < nums.length && nums[j] == val) {
                    j++;
                }
                if (j < nums.length) {
                    nums[i] = nums[j++];
                }

                count++;
            }

        }

        return count;
    }
}
