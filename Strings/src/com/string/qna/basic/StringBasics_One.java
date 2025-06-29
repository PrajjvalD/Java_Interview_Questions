package com.string.qna.basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringBasics_One {
    public static void main(String[] args) {
        // 1. Write a program to calculate the total number of characters in the String
        countCharString();

        // 2. How to print all permutations of string in Java?
        printPermutation("CATA","");

        // 3. How to reverse a string in Java?
        reverseString();

        // 4. How to convert an Array to String in Java?
        convertArrayToString();

        // 5. Count the number of times a given character appears in a String?
        charAppearToString();

        // 6. In what way should two strings be compared to determine whether they are anagrams?
        anagramsCheckInString();

        // 7. Write a Java program to check if a vowel is present in a string
        isVowelPresentString();

        // 8.

    }

    private static void isVowelPresentString() {
        String str = "Hkjk";
        if(str.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("Is vowel present in string "+ str+" : Yes");
        }else {
            System.out.println("Is vowel present in string " + str+" : No");
        }
    }

    private static void anagramsCheckInString() {
        String str = "Hello";
        String str2 = "olleHi";
        if(str.length() != str2.length()){
            System.out.println("Is "+str +" and "+str2+" are anagram ? : No");
        }else {
                char[] c = str.toCharArray();
                char[] c1 = str2.toCharArray();
                Arrays.sort(c);
                Arrays.sort(c1);
                if (Arrays.equals(c,c1)) {
                    System.out.println("Is " + str + " and " + str2 + " are anagram ? Yes" );
                }
        }
    }

    private static void charAppearToString() {
        String str = "Prajjval";
        int count = 0;
        char givenValue = 'a';
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i)==givenValue){
                count+=1;
            }
        }
        System.out.println(givenValue+" appears "+count+" times in given string "+str);
    }

    private static void convertArrayToString() {

        int[] intArray = {1,2,3,4,5,6};
        String str = Arrays.toString(intArray);
        System.out.println("convert int array to string:: "+ str + " ::type:: "+str.getClass().getName());
        String intArrayToString = Arrays.stream(intArray).mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println("convert int array to string using stream:: "+ intArrayToString + " ::type:: "+intArrayToString.getClass().getName());
        String[] strArray = {"a","b"," ","c","d"};
        String string= Arrays.stream(strArray).map(String::valueOf).collect(Collectors.joining());
        System.out.println("convert string array to string using stream:: "+ string + " ::type:: "+string.getClass().getName());
    }

    private static void reverseString() {
        String str = "Hello, World!";
        String revStreamString = str.chars().mapToObj(c->(char) c).collect(Collectors.collectingAndThen(
                Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream().map(String::valueOf).collect(Collectors.joining());
                }
        ));
        String revByStringBuilder = new StringBuilder(str).reverse().toString();
        StringBuilder strBuilder = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            strBuilder.append(str.charAt(i));
        }
        System.out.println("option 1:: "+str+" reverse is :: "+revStreamString);
        System.out.println("option 1:: "+str+" reverse is :: "+revByStringBuilder);
        System.out.println("option 1:: "+str+" reverse is :: "+strBuilder);
    }

    private static void countCharString() {
        String str = "Hello, World!";
        int count = 0;
        for(int i=0;i<=str.length()-1;i++){
            if(!("").equals(str.charAt(i))){
                count++;
            }
        }
        System.out.println("total number of given string:: + "+str+" is :: "+count);
    }

    private static void printPermutation(String str, String str1) {

        if (str.isEmpty()) {
            System.out.println(str1);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String str2 = str.substring(0,i) + str.substring(i+1);
            printPermutation(str2, str1+ch);
        }
    }
}
