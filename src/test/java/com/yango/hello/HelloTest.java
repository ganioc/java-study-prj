package com.yango.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelloTest {
    @Test
    public void helloTest(){
        Hello pHello = new Hello();
        Assertions.assertEquals(1,1);
        String[] lst = {"1st", "2nd", "3rd", "4th"};
        for(int i=0; i< lst.length; i++){
            System.out.println(lst[i]);
        }
    }

    @Test
    public void secondTest(){

    }
}
