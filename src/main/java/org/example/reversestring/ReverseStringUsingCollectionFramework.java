package org.example.reversestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReverseStringUsingCollectionFramework {

    public static String reverse(String string)
    {

        List<Character> list = new ArrayList<Character>();


        for (char c1: string.toCharArray()) {
            list.add(c1);
        }

        Collections.reverse(list);


        return list.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String args[])
    {
        String s = " hello ,how are you? ";

        s = reverse(s);

        System.out.println(" The string after reversing is:  " + s);
    }
}


