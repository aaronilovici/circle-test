package com.example.circletest;

import java.util.Arrays;
import java.util.List;

public class SimpleClass {

    private int ten = 10;
    private List<Integer> list = Arrays.asList(1, 2, 3, 4);

    public SimpleClass() {
        doSomethingHere();
        lastbutnotleast(1);
    }

    public int doSomethingHere() {
        return ten;
    }

    public static void somethingalso(int param) throws NullPointerException {
        switch (param) {
            case 0:
                System.out.println("BLAH");
                break;
            default:
                throw new NullPointerException();
            case 1:
                System.out.println("BLAH TWICE");
                break;
        }
    }

    public static int lastbutnotleast(int param) throws NullPointerException {
        if (param == 1) {
            param =+ 1;
        }
        return param;
    }

    public String badCode () {
        list.add(1);
        return "THIS IS BAD CODE";
    }

    public String alsoBadCode () {
        list.add(1);
        return "THIS IS BAD CODE";
    }
}
