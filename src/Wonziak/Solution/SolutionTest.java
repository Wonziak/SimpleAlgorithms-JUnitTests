package Wonziak.Solution;

import Wonziak.MyException;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    public static void test(){
        Solution x=new Solution();
        List<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(7);
        l.add(8);
        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        l.add(0);
        l.add(-2);
        l.add(-4);
        l.add(-8);
        try {
            System.out.println("Solution is "+x.solution(l));
        }
        catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
