package com.yango.hello;

public class Multiply {
    int value1;
    int value2;

    Multiply(){

    }
    Multiply(int x, int y){
        value1 =x;
        value2 = y;
    }
    public  int multiply(){
        int z = value1 * value2;
        return z;
    }
}
