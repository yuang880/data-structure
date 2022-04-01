package com.jiangyan.algorithm.symbol;

/**
 * 符号表的测试
 */
public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> table = new SymbolTable<>();
        table.put(1, "a");
        table.put(2, "b");
        table.put(3, "c");
        table.put(4, "d");
        table.put(5, "e");
        System.out.println(table.size());
        System.out.println(table.get(2));
    }
}
