package xifa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数组形式的整数加法
 * @link https://leetcode-cn.com/problems/add-to-array-form-of-integer
 * @author jinp
 * @date 2021/9/11 19:00
 */
public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(addToArrayForm(arr, 876));

    }


    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0 || k > 0; --i, k /= 10) {
            if (i >= 0) {
                k += num[i];
            }
            list.add(k % 10);
        }
        Collections.reverse(list);
        return list;
    }


}
