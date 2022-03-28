package com.jiangyan.algorithm.linear;

/**
 * 使用栈来解决括号匹配问题
 */
public class BracketsMathTest {
    public static void main(String[] args) {
        String str = "(上海(静安区())";
        boolean match = isMath(str);
        System.out.println(str + "中的括号是否满足" + match);
    }

    /**
     * 利用栈的思想，有一个左括号就压栈，遇到右括号就弹栈，弹栈为null就说明没有匹配的左括号
     */
    private static boolean isMath(String str) {
        MyStack<String> stack = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {
            // 每一个字符 == 左括号，就压栈
            String curr = str.charAt(i) + "";
            if(curr.equals("(")){
                stack.push(curr);
            }else if(curr.equals(")")){
                // 弹栈
                String pop = stack.pop();
                if(pop == null){
                    return false;
                }
            }
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }
}
