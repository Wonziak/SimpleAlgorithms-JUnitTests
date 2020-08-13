package Wonziak.Solution;

import Wonziak.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(List<Integer> a) throws MyException {
        List<Integer> b = new ArrayList<>(a);
            if (a.isEmpty()) {
                throw new MyException("empty list");
            }
            if (a.size() > 100000) {
                throw new MyException("too big list");
            }

            Collections.sort(b);
            if (b.get(0) < -1000000 || b.get(b.size() - 1) > 1000000) {
                throw new MyException("too big list");
            }

        if( b.get(b.size() - 1)<=0){
            return 1;
        }
        for (int i = 1; i <=  b.get(b.size() - 1); i++) {
            if (!b.contains(i)) {
                    return i;
            }

        }
        return  b.get(b.size()-1)+1;
    }


}
