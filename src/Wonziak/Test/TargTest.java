package Wonziak.Test;

import Wonziak.MyException;
import Wonziak.Target.Target;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TargTest {

    @Test
    public void targetCantBeFound(){
        Target tar=new Target();
        double[] l2 = new double[0];
        assertThrows(MyException.class,()->{
            tar.solution(l2,-1);
        });
    }

    @Test
    public void targetCanBeFound(){
        Target tar=new Target();
        double[] l2 = new double[4];
        l2[0] = -10;
        l2[1] = -12;
        l2[2] = 14;
        l2[3] = 16;
        assertDoesNotThrow(()->{
            tar.solution(l2,-22);
        });


}

}