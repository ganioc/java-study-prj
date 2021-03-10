package com.yango.hello;


import java.io.BufferedReader;
import java.io.FileReader;

public class Hello {
    public static void main(String[] args){
        System.out.print("Hello world\n");

        String[] fruits = { "apple", "orange", "banana"};
        System.out.println(fruits[0]);

        String s1, s2;
        int num = 24;
        double d = 1.234;
        s1 = Integer.toString(num);
        s2 = Double.toString(d);
        System.out.printf("%s %s\n", s1, s2);

        System.out.printf("%d\n", "ant".compareTo("bee"));
        TestFile testFile = new TestFile();
        testFile.testFile("./src/main/resources/Hello.txt");
    }

}
