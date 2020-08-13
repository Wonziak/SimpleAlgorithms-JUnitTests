package Wonziak.Target;

import Wonziak.MyException;

public class TargetTest {
    public static void test(){
        Target t=new Target();
        double[] l2 = new double[4];
        l2[0] = -10;
        l2[1] = -12;
        l2[2] = 14;
        l2[3] = 16;
        try {
            for (int sols : t.solution(l2, -22)) {
                System.out.println(sols);
            }
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
