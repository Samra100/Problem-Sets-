package com.company;

public class UniqueArray {
    // Sorted array numbers
    // remove the duplicates
    //place such that each element appear only once
    //return the new length

    //Example
//Given numbers = [1,1,2],

//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

//It does not matter what you leave beyond the returned length.

    public int uniqueArr(int[] nums) {

        int length = nums.length;
        int newL = 1;

        if (nums.length < 2) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                newL++;
            }
            return newL;
        }

    }
}
