package Wonziak.Matrix;

import java.util.Random;

public class MatrixTest {
    public static void test(){
        Random random = new Random();
        Matrix<String> matrix1= new Matrix<>(5,5);
        Matrix<String> matrix2= new Matrix<>(5,5);

        MatrixIterator matrix1Iterator=(MatrixIterator) matrix1.iterator();
        MatrixIterator matrix2Iterator=(MatrixIterator) matrix2.iterator();


        while (matrix1Iterator.hasNext()){
            matrix1Iterator.setNext(Integer.toString(random.nextInt()%100));
        }


        while (matrix2Iterator.hasNext()){
            matrix2Iterator.setNext(Integer.toString(random.nextInt()%100));
        }
        System.out.println("Macierz 1:");
        matrix1.print();
        System.out.println("Macierz 2:");
        matrix2.print();
        System.out.println("Macierz 1 + macierz 2:");
        try {
            Matrix<String> matrix3= Matrix.addS(matrix1,matrix2);
            matrix3.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
//Integers
        Matrix<Integer> matrix4= new Matrix<>(5,5);
        Matrix<Integer> matrix5= new Matrix<>(5,5);

        MatrixIterator matrix4Iterator=(MatrixIterator) matrix4.iterator();
        MatrixIterator matrix5Iterator=(MatrixIterator) matrix5.iterator();


        while (matrix4Iterator.hasNext()){
            matrix4Iterator.setNext(random.nextInt()%100);
        }


        while (matrix5Iterator.hasNext()){
            matrix5Iterator.setNext(random.nextInt()%100);
        }
        System.out.println("Macierz 4:");
        matrix4.print();
        System.out.println("Macierz 5:");
        matrix5.print();
        System.out.println("Macierz 4 + macierz 5:");
        try {
            Matrix<Integer> matrix6= Matrix.add(matrix4,matrix5);
            matrix6.print();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
