package com.string.learn;

public class StringOperations {
    // 1. Basic Information Methods
    public static void basicInfoMethods() {
        String str = " Hello Java ";
        System.out.println("Length: " + str.length());
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());
    }

    // 2. Character Access
    public static void characterAccessMethods() {
        String str = "Java";
        System.out.println("charAt(2): " + str.charAt(2));
        System.out.println("codePointAt(2): " + str.codePointAt(2));
        System.out.println("codePointBefore(2): " + str.codePointBefore(2));
        System.out.println("codePointCount(0, 4): " + str.codePointCount(0, 4));
    }

    // 3. String Comparison
    public static void comparisonMethods() {
        String a = "Java";
        String b = "java";
        System.out.println("equals: " + a.equals(b));
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b));
        System.out.println("compareTo: " + a.compareTo(b));
        System.out.println("compareToIgnoreCase: " + a.compareToIgnoreCase(b));
        System.out.println("startsWith: " + a.startsWith("Ja"));
        System.out.println("endsWith: " + a.endsWith("va"));
        System.out.println("matches: " + a.matches("J..a"));
    }

    // 4. Searching
    public static void searchMethods() {
        String str = "hello world";
        System.out.println("contains: " + str.contains("world"));
        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));
    }

    // 5. Substring and Slicing
    public static void substringMethods() {
        String str = "JavaProgramming";
        System.out.println("substring(4): " + str.substring(4));
        System.out.println("substring(0, 4): " + str.substring(0, 4));
    }

    // 6. Modification
    public static void modificationMethods() {
        String str = " Hello World ";
        System.out.println("concat: " + str.concat("!!"));
        System.out.println("replace: " + str.replace('o', 'O'));
        System.out.println("replaceAll: " + str.replaceAll("l", "L"));
        System.out.println("replaceFirst: " + str.replaceFirst("l", "L"));
        System.out.println("trim: " + str.trim());
        System.out.println("repeat: " + "Hi ".repeat(3));
    }

    // 7. Case Conversion
    public static void caseConversionMethods() {
        String str = "Java";
        System.out.println("toLowerCase: " + str.toLowerCase());
        System.out.println("toUpperCase: " + str.toUpperCase());
    }

    // 8. Splitting and Joining
    public static void splitJoinMethods() {
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println("join: " + String.join(" | ", fruits));
    }

    // 9. Utility Methods
    public static void utilityMethods() {
        String str = "Java";
        System.out.println("intern: " + str.intern());
        System.out.println("toCharArray: " + java.util.Arrays.toString(str.toCharArray()));
        System.out.println("valueOf: " + String.valueOf(123));
        System.out.println("format: " + String.format("Hello %s", "World"));
    }

    public static void main(String[] args) {
        basicInfoMethods();
        characterAccessMethods();
        comparisonMethods();
        searchMethods();
        substringMethods();
        modificationMethods();
        caseConversionMethods();
        splitJoinMethods();
        utilityMethods();
    }
}
