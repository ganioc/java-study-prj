package com.yango.hello;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFile {
    public void testFile(String fileName) {
        try {
            BufferedReader inFile = new BufferedReader(
                    new FileReader(fileName)
            );
            String line;
            while ((line = inFile.readLine()) != null) {
                System.out.printf("%s\n", line);
            }

        } catch (Exception e) {
            System.out.printf("%s\n", e.getMessage());
        }
    }
}
