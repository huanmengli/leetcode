package com.test.hebing;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Admin
 */
public class HeBing {
    private static final int LENGTH = 2;
    public static void main(String[] args) {
        int[] nums ={3,2,3};
        final int i = majorityElement(nums);
        System.err.println(i);
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
