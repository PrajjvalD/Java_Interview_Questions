package com.string.learn;

public class StringBuilderOperations {

    // 1. Basic Info Methods
    public static void basicInfoMethods() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());
    }

    // 2. Appending and Inserting
    public static void appendInsertMethods() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        System.out.println("After append and insert: " + sb);
    }

    // 3. Deletion and Replacement
    public static void deleteReplaceMethods() {
        StringBuilder sb = new StringBuilder("Hello, World");
        sb.delete(5, 7);
        System.out.println("After delete: " + sb);
        sb.replace(5, 10, " Java");
        System.out.println("After replace: " + sb);
    }

    // 4. Reversing and Modifying Characters
    public static void reverseAndModifyMethods() {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println("Reversed: " + sb);
        sb.setCharAt(0, 'j');
        System.out.println("After setCharAt: " + sb);
    }

    // 5. Substrings and Char Extraction
    public static void substringCharMethods() {
        StringBuilder sb = new StringBuilder("HelloWorld");
        String substr = sb.substring(0, 5);
        System.out.println("Substring: " + substr);
        char[] chars = new char[5];
        sb.getChars(0, 5, chars, 0);
        System.out.println("Chars extracted: " + java.util.Arrays.toString(chars));
    }

    // 6. Index and Comparison
    public static void indexAndComparisonMethods() {
        StringBuilder sb = new StringBuilder("Hello World");
        int index = sb.indexOf("World");
        System.out.println("indexOf 'World': " + index);
        int lastIndex = sb.lastIndexOf("l");
        System.out.println("lastIndexOf 'l': " + lastIndex);
    }

    public static void main(String[] args) {
        basicInfoMethods();
        appendInsertMethods();
        deleteReplaceMethods();
        reverseAndModifyMethods();
        substringCharMethods();
        indexAndComparisonMethods();
    }
}
