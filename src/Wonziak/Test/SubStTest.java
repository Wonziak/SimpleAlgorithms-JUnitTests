package Wonziak.Test;

import Wonziak.Substring.Substring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubStTest {


    @Test
    public void stringContainsPattern(){
        String a="abcdefgh";
        String b="efghabcd";
        Substring sub=new Substring();
        assertEquals(2,sub.substring(a,b));
    }

//    @Test
//    public void doesNotContain(){
//        String a="";
//        String b="efghabcd";
//        Substring sub=new Substring();
//        assertNotEquals(2,sub.substring(a,b));
//    }
}