package com.atdefu004;

/**
 * ClassName: BinarySearch
 * Package: com.atdefu004
 * Description: 基础二分查找
 *
 * @Author 华因斯坦
 * @Create 2025/3/24 17:51
 * @Version 1.0
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        while(l <= r){
            m = l + ((r - l) >> 1);
            if(arr[m] < target){
                l = m + 1;
            }
            if(arr[m] > target){
                r = m -1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
}
