package com.string.learn;

import java.nio.charset.StandardCharsets;

public class StringCreation {
    
    public static void creatingString(){
        // 1. Using String Literals
        String s1 = "Hello";
        System.out.println("s1 (Literal): " + s1);

        // 2. Using new Keyword
        String s2 = new String("Hello");
        System.out.println("s2 (new keyword): " + s2);

        // 3. From char[] Array
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars);
        System.out.println("s3 (char array): " + s3);

        // 4. From byte[] Array
        byte[] bytes = {65, 66, 67}; // ASCII for A, B, C
        String s4 = new String(bytes);
        System.out.println("s4 (byte array default charset): " + s4);

        String s5 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("s5 (byte array UTF-8): " + s5);

        // 5. Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        String s6 = sb.toString();
        System.out.println("s6 (from StringBuilder): " + s6);

        // 6. Using StringBuffer
        StringBuffer sf = new StringBuffer("Hellow");
        String s7 = sf.toString();
        System.out.println("s7 (from StringBuffer): " + s7);

        // 7. From String.valueOf() (Primitive to String)
        String s8 = String.valueOf(123);
        String s9 = String.valueOf(true);
        System.out.println("s8 (from int using valueOf): " + s8);
        System.out.println("s9 (from boolean using valueOf): " + s9);

    }
    
    public static void main(String[] args) {

        creatingString();
        creatingStringBuilder();
        creatingStringBuffer();

    }

    private static void creatingStringBuffer() {
        // 1. Default constructor (initial capacity = 16)
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Default Capacity");
        System.out.println("sb1: " + sb1);

        // 2. Constructor with initial capacity
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Capacity 50");
        System.out.println("sb2: " + sb2);

        // 3. Constructor with initial string
        StringBuffer sb3 = new StringBuffer("Hello");
        System.out.println("sb3: " + sb3);

        // 4. Constructor with CharSequence (e.g., StringBuilder, String)
        CharSequence cs = "CharSequence example";
        StringBuffer sb4 = new StringBuffer(cs);
        System.out.println("sb4: " + sb4);
    }

    private static void creatingStringBuilder() {
        // 1. Default constructor (initial capacity = 16)
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Default Capacity");
        System.out.println("sb1: " + sb1);

        // 2. Constructor with initial capacity
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("Capacity 50");
        System.out.println("sb2: " + sb2);

        // 3. Constructor with initial string
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println("sb3: " + sb3);

        // 4. Constructor with CharSequence (e.g., StringBuffer, String)
        CharSequence cs = "CharSequence example";
        StringBuilder sb4 = new StringBuilder(cs);
        System.out.println("sb4: " + sb4);
    }
}
