package javaExamples.interviewRecipes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Program to Reverse a string using
 * <p>
 * 1. StringBuilder / StringBuffer - StringBuffer is thread safe
 * <p>
 * 2. Byte Array
 * <p>
 * 3. Recursion
 * <p>
 * 4. Swapping with char variable
 * <p>
 * 5. ListIterator
 */
public class ReverseAString {

    public String invertWithStringBuffer(String str) {

        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }

    public String invertWithoutStringBuffer(String str) {

        int length = str.length();
        String original = str;
        String invert = "";
        for (int i = length - 1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        return invert;
    }

    public String reverse(String str) {

        int i = str.length();
        StringBuffer strb = new StringBuffer();
        for (int j = i - 1; j >= 0; j--) {
            strb.append(str.charAt(j));
        }

        return strb.toString();
    }

    public String reverseStringUsingRecursion(String str) {

        if (str.isEmpty()) {

            return str;
        }

        // Calling Function Recursively
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);

    }

    public void reverseUsingListIterator(String str) {

        char[] charArray = str.toCharArray();

        List<Character> listOfChar = new ArrayList<>();

        for (char c : charArray) {

            listOfChar.add(c);

        }

        Collections.reverse(listOfChar);

        ListIterator listIterator = listOfChar.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }

    }

    public static void main(String[] args) {

        ReverseAString invertStr = new ReverseAString();

        System.out.println("Reversed String with StringBuffer class => "
                + invertStr.invertWithStringBuffer("Gaurav Kumar Khanna"));

        System.out.println("Reversed String with Byte Array class => "
                + invertStr.invertWithoutStringBuffer("Gaurav Kumar Khanna"));

        System.out.println("Reversed String with Recursion class => "
                + invertStr.reverseStringUsingRecursion("Gaurav Kumar Khanna"));

        System.out.println("Reversed String without List Iterator class => ");

        invertStr.reverseUsingListIterator("Gaurav Kumar Khanna");

    }

}


