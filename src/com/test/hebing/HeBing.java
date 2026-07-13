package com.test.hebing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Admin
 */
public class HeBing {
    private static final int LENGTH = 2;
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums,3);

    }

    public static void rotate(int[] nums, int k) {
        if (k==0){
            return;
        }
        int n =  k % nums.length ;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(nums[nums.length-n+i]);
        }
        for (int i = 0; i < nums.length-list1.size(); i++) {
            list2.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i<list1.size()){
                nums[i]=list1.get(i);
            }else {
                nums[i]=list2.get(i-list1.size());
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.err.println(nums[i]);
        }
    }

    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;

        if(nums.length ==1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            if(map.get(nums[i]) == null){
                map.put(nums[i],0);
                num = map.get(nums[i]);
                if(map.get(nums[i])>max){
                    max = map.get(nums[i]);
                }
            }else{
                if(map.get(nums[i])>max){
                    max = map.get(nums[i]);
                }
                continue;
            }

            for(int j = i ; j < nums.length ; j++){
                if(nums[i]==nums[j]){
                    num++;
                    map.put(nums[i],num);
                }
            }

        }
        Set<Integer> keys =  map.keySet();
        int count = 0;
        for(Integer key : keys){
            Integer a = map.get(key);
            if(a == max){
                count = key;
            }
        }
        return count;
    }

    /**
     * 双指针解法
     * 1.建立 快指针 fast 遍历数组每个变量 ；建立慢指针 slow 对新数组进行赋值
     * 2.检查上上个应该被保留的元素 nums[slow−2] 是否和当前待检查元素 nums[fast]相同 相同则fast++ 不相同则对新数组赋值
     * */
    public int removeDuplicates(int[] nums) {
        int slow = 2;
        int fast = 2;
        //排除数组长度小于2的情况
        if(nums.length < LENGTH){
            return nums.length;
        }

        while(fast<nums.length){
            if(nums[slow-2]!=nums[fast]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
