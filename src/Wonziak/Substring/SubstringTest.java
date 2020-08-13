package Wonziak.Substring;


public class SubstringTest {
    public static void test() {
        String s1 = "abcdefgh";
        String s2 = "efghabcd";
        Substring s = new Substring();
        int sol = s.substring(s1, s2);
        System.out.println("wielokrotność pierwszego ciągu: " + sol);
    }
}