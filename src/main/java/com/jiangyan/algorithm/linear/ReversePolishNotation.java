package com.jiangyan.algorithm.linear;

/**
 * 使用栈求出只包含+-乘除四种运算的后缀表达式的结果
 */
public class ReversePolishNotation {
    public static void main(String[] args) {
        // 3*(17-15) + 18/6 的后缀表达式如下：   9
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = caculate(notation);
        System.out.println("逆波兰表达式的结果为：" + result);
    }

    private static int caculate(String[] notation) {
        MyStack<Integer> oprands = new MyStack<>();
        for (int i = 0; i < notation.length; i++) {
            String curr = notation[i];
            // 使用switch判断是操作数还是运算符
            Integer o1;
            Integer o2;
            int result;
            switch (curr){
                case "+":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o1 + o2;
                    oprands.push(result);
                    break;
                case "-":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o2 - o1;
                    oprands.push(result);
                    break;
                case "*":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o1 * o2;
                    oprands.push(result);
                    break;
                case "/":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o2 / o1;
                    oprands.push(result);
                    break;
                default:
                    oprands.push(Integer.parseInt(curr));
                    break;
            }
        }
        return oprands.pop();
    }
}
