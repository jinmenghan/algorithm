package xifa.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 821. 字符的最短距离
 * @link https://leetcode-cn.com/problems/shortest-distance-to-a-character/
 * @author jinp
 * @date 2021/9/11 19:08
 */
public class ShortestToChar {

    public static void main(String[] args) {
//        int[] ints = shortestToChar("loveleetcode", 'e');
        int[] ints2 = shortestToChar2("loveleetcode", 'e');
        for (int i : ints2){
            System.out.print(i + ",");
        }
    }

    public static int[] shortestToChar(String s, char c){

        int N = s.length();
        int[] ans = new int[N];

        List<Integer> indexArr= new ArrayList<>();
        // 记录 c的位置
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == c) {
                indexArr.add(i);
            }
        }

        // 遍历每个字符，取最小路径
        for (int i = 0; i < N; i++) {
            int temp = Integer.MAX_VALUE;
           for(int j = 0; j < indexArr.size(); j++){
               temp = Math.min(temp, Math.abs(i - indexArr.get(j)));
           }
           ans[i] = temp;
        }
        return ans;
    }



    public static int[] shortestToChar2(String s, char c) {
        int N = s.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (s.charAt(i) == c){
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
