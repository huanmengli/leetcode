package com.test.hebing;

public class Leet714 {
    public static void main(String[] args) {
        int[] newArr = {1,0,2,3,0,4,5,0};
        duplicateZeros(newArr);
    }
    public static void duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        int fast = 0;
        int slow = 0;
        int n = arr.length;
        while(n>slow){
            if(arr[fast]==0){
                newArr[slow] = arr[fast];
                slow++;
            }
            if(slow==n){
                break;
            }
            newArr[slow] = arr[fast];
            slow++;
            fast++;
        }
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }
}
