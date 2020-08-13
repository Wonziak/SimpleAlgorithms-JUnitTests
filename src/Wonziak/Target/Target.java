package Wonziak.Target;

import Wonziak.MyException;

import java.util.Hashtable;

public class Target {


    public static int[] solution(double[] arr, double target) throws MyException {
        Hashtable<Double, Integer> table = new Hashtable<>();
        for (int i=0; i<arr.length; i++){
                if(table.containsKey(arr[i])){
                    return new int[]{table.get(arr[i]),i};
                }
                table.put(target-arr[i],i);

        }

        throw new MyException("No solution");
    }


}