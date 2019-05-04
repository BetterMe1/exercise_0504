package exercise.exercise_0504;


//代码的完整性

/*
数值的整数次方
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
/*
public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1.0;
        }else if(exponent < 0){
            return 1.0/(Math.pow(base,-exponent));
        }else{
            return Math.pow(base,exponent);
        }
    }
}
*/
/*
调整数组顺序使奇数位于偶数前面
 */
/*
public class Solution {
    public void reOrderArray(int [] array) {
        int len = array.length;
        int[] tmp1 = new int[len];
        int[] tmp2 = new int[len];
        int i = 0;
        int j = 0;
        for(int k=0; k<len; k++){
            if(array[k]%2 != 0){
                tmp1[i] = array[k];
                i++;
            }else{
                tmp2[j] = array[k];
                j++;
            }
        }
        System.arraycopy(tmp1,0,array,0,i);
        System.arraycopy(tmp2,0,array,i,j);
    }
}*/

//举例让抽象具体化
/*
栈的压入、弹出序列
 */
import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int len1=pushA.length;
        int len2=popA.length;
        if(len1 != len2){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i=0; i<len1; i++){
            stack.push(pushA[i]);
            if(pushA[i] == popA[j]){
                stack.pop();
                j++;
            }
        }
        for(; j<len2; j++){
            if(stack.peek() == popA[j]){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.empty();
    }
}