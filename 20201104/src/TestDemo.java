import java.util.Stack;

/**
 * @Version 1.0
 * @Author: Hu
 * @DATE: 2020/11/4 11:47
 * Content:
 */
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();//入
        minStack = new Stack<>();//出
    }

    public void push(int x) {
        //1、stack是一定需要放元素的
        stack.push(x);
        //2、最小栈当中 是否存放数据   x<= 最小栈的栈顶元素
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        //1、stack是一定需要弹出元素的
        int tmp = stack.pop();
        //2、最小栈当中 是否弹出数据    x  ==  最小栈的栈顶元素
        if(tmp == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        //跟最小栈没有关系
        return stack.peek();
    }

    public int getMin() {
        //每次返回最小栈的栈顶元素
        return minStack.peek();
    }
}

public class TestDemo {
    public static void main(String[] args) {
    }
}
