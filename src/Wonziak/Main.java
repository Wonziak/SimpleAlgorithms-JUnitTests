package Wonziak;

import Wonziak.Matrix.MatrixTest;
import Wonziak.Solution.SolutionTest;
import Wonziak.Sorts.SortsTest;
import Wonziak.Substring.SubstringTest;
import Wonziak.Target.TargetTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Matrix");
        MatrixTest.test();
        System.out.println("Solution");
        SolutionTest.test();
        System.out.println("Substring");
        SubstringTest.test();
        System.out.println("Target");
        TargetTest.test();
        System.out.println();
        System.out.println("Sorts");
        SortsTest.test();
        System.out.println();
    }
}

