package com.atdefu003;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: validator
 * Package: com.atdefu003
 * Description:   对数器
 *
 * @Author 华因斯坦
 * @Create 2025/3/24 12:38
 * @Version 1.0
 */
public class validator {

    public static void main(String[] args) {
        //随机数组的最大长度
        int N = 200;
        //随机数组每个值，在1~v之间等概率随机
        int V = 1000;
        //测试次数
        int testTimes = 500000;
        System.out.println("测试开始");
        for (int i = 0; i < testTimes; i++) {
            //随即得到一个长度，长度在[0 ~ N - 1]
            int n = (int)(Math.random() * N);
            //得到随机数组
            int[] arr = randomArray(n,V);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            int[] arr3 = copyArray(arr);
            selectionSort(arr1);
            bubbleSort(arr2);
            insertionSort(arr3);
            if(!sameArray(arr1,arr2) || !sameArray(arr1,arr3)){
                System.out.println("出错了！");
            }
            System.out.println("测试结束");
        }
    }

    //为了验证
    //得到一个随机数组,长度是n
    //数组中的每个数，都在1~v之间，随机得到
    public static int[] randomArray(int n, int v){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // Math.random() -> double -> [0,1)范围山的一个小数，0.37463473126、0.001231231，等概率！
            // Math.random() * v -> double -> [0,v)一个小数，依然等概率
            // (int)(Math.random() * v) -> int -> 0 1 2 3 ... v-1，等概率的！
            // (int) (Math.random() * v) + 1 -> int -> 1 2 3 .... v，等概率的！
            arr[i] = (int)(Math.random() * v);
        }
        return arr;
    }

    //为了验证
    public static int[] copyArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    //也是为了验证
    public static boolean sameArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //选择排序
    public static void selectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int minIndex, i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int end = arr.length - 1; end > 0; end--){
            for (int i = 0; i < end; i++) {
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    //插入排序
    public static void insertionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }

        }
    }



}

