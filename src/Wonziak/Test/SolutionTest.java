package Wonziak.Test;

import Wonziak.MyException;
import Wonziak.Solution.Solution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
@Test
public void isListEmpty(){
    Solution sol=new Solution();
    List<Integer> b = new ArrayList<>();
    assertThrows(MyException.class,()->{
        sol.solution(b);
    });
}
    @Test
    public void isListTooBig(){
        Solution sol=new Solution();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 200000; i++) {
            b.add(0);
        }
        assertThrows(MyException.class,()->{
            sol.solution(b);
        });
    }
    @Test
    public void isSmallestValueOutOfRange(){
        Solution sol=new Solution();
        List<Integer> b = new ArrayList<>();
        b.add(-1000020);
        assertThrows(MyException.class,()->{
            sol.solution(b);
        });
    }
    @Test
    public void isBiggestValueOutOfRange(){
        Solution sol=new Solution();
        List<Integer> b = new ArrayList<>();
        b.add(1000020);
        assertThrows(MyException.class,()->{
            sol.solution(b);
        });
    }
    @Test
    public void isBiggestNumberNotPossitive(){
        Solution sol=new Solution();
        List<Integer> b = new ArrayList<>();
        b.add(-2);
        assertDoesNotThrow(()->{
            sol.solution(b);
        });

    }
    @Test
    public void solutionFoundBetweenObjectsOnList(){
        Solution x=new Solution();
        int s;
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
        try{
           s=x.solution(l);
           assertEquals(9,s);
        }
        catch (MyException e){
        }
    }
    @Test
    public void solutionFoundOnLastIndex(){
        Solution x=new Solution();
        int s;
        List<Integer> l = new ArrayList<>();
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
        try{
            s=x.solution(l);
            assertEquals(9,s);
        }
        catch (MyException e){
        }
    }
}