package com.example.circletest;

import java.util.Arrays;
import java.util.List;

public class UtilCrapClass {


    private List<Integer> list = Arrays.asList(1, 2, 3, 4);
    private List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
    private List<Integer> list5 = Arrays.asList(1, 2, 3, 4);

    public String badCode () {
        list.add(1);
        somethingalso(1);
        return "THIS IS BAD CODE";
    }

  public String alsoBadCode() {
    list.add(1);
     somethingelse(1);
    return "THIS IS BAD CODE";
    }

       public static void somethingelse(int param) throws NullPointerException {
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

    public static void lastbutnotleast(int param) throws NullPointerException {
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
}
