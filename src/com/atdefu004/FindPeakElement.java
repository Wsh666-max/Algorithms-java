package com.atdefu004;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: test
 * Package: com.atdefu004
 * Description: 力扣面试题
 *
 * @Author 华因斯坦
 * @Create 2025/3/24 18:04
 * @Version 1.0
 */
public class FindPeakElement {
    public static int findPeakElement(int[] nums){
        if(nums.length == 1) return 0;
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length - 1;
        }

        int l = 1;
        int r = nums.length - 2;
        int mid = 0;
        int ans = -1;
        while (l <= r) {
            mid = l + ((r - l) >> 1);
            if(nums[mid] < nums[mid - 1]) {
                r = mid - 1;
            }else if(nums[mid] < nums[mid + 1]){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return ans;
    }

}
