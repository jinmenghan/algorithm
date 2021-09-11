package Leetcode.l01;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author jinp
 * @date 2021/9/4 13:13
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapper = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapper.containsKey(target - nums[i])) {
                return new int[] {mapper.get(target - nums[i]), i};
            }
            mapper.put(nums[i], i);
        }
        return new int[] {};
    }

    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.empty() && T[i] > T[stack.peek()]) {
                int top = stack.pop();
                ans[top] = i - top;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,4,5,5,4,3};

        System.out.println(solution.twoSum(arr , 2).toString());

        System.out.println(solution.dailyTemperatures(arr ));
    }

}
