package com.yango.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelloTest {
    @Test
    public void helloTest(){
        Hello pHello = new Hello();
        Assertions.assertEquals(1,1);
    }
}
