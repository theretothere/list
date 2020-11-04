import java.util.concurrent.CancellationException;

/**
 * @Version 1.0
 * @Author: Hu
 * @DATE: 2020/11/4 16:16
 * Content:
 */
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if(A == null){
            return false;
        }
        int sum = 0;
        for(int i = 0 ; i < A.length ; i++ ){
            sum += A[i];
        }
        if(sum == 0){
            return false;
        }
        if(sum % 3 != 0){
            return false;
        }
        sum /= 3;
        int num = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            num += A[i];
            if (num == sum) {
                count++;
                num = 0;
            }
        }
        // 最后判断是否找到了3段（注意如果目标值是0的话可以大于3段）
        return count == 3 || (count > 3 && sum == 0);
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        int[] a = {1,51,45,48,79};
        Solution solution = new Solution();
        System.out.println(solution.canThreePartsEqualSum(a));
    }
}
