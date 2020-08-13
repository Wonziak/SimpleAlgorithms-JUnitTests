package Wonziak.Sorts;

import java.util.Random;

public class SortsTest {
    public static void test() {
        Random random = new Random();
        System.out.println("BubbleSort");
        System.out.println();
        int[] arrBR = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrBR[i] =100000+ random.nextInt() % 100000;
        }
        BubbleSort ob = new BubbleSort();
        double tStart = System.currentTimeMillis();
        ob.bubbleSort(arrBR);
        double tEnd = System.currentTimeMillis();
        double tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrBR[i]);
        }
        System.out.println("Realistc time " + tDelta);
        System.out.println();


        tStart = System.currentTimeMillis();
        ob.bubbleSort(arrBR);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrBR[i]);
        }
        System.out.println("Opitmistic time " + tDelta);
        System.out.println();
        for (int i = 0; i < 100000; i++) {
            int tmp=arrBR[i];
            arrBR[i] =arrBR[99999-i];
            arrBR[99999-i]=tmp;
        }

//        int[] arrBP = new int[100000];
//        for (int i = 0; i <100000; i++) {
//            arrBP[i]=99999-i;
//        }
        tStart = System.currentTimeMillis();
        ob.bubbleSort(arrBR);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrBR[i]);
        }
        System.out.println("Pesimitic time " + tDelta);
        System.out.println();
        System.out.println("Merge sort");
        System.out.println();

        int[] arrMR = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrMR[i] = 100000+random.nextInt() % 100000;
        }
        MergeSort obM = new MergeSort();
        tStart = System.currentTimeMillis();
        obM.sort(arrMR, 0, arrMR.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrMR[i]);
        }
        System.out.println("Realistc time " + tDelta);
        System.out.println();


        int[] arrMO = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrMO[i] = i;
        }
        tStart = System.currentTimeMillis();
        obM.sort(arrMO, 0, arrMO.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrMO[i]);
        }
        System.out.println("Opitmistic time " + tDelta);
        System.out.println();


        int[] arrMP = new int[100000];
        for (int i =0; i < 100000; i++) {
            arrMP[i]=99999-i;
        }
        tStart = System.currentTimeMillis();
        obM.sort(arrMP, 0, arrMP.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        System.out.println("Pesimitic time " + tDelta);
        System.out.println();
        System.out.println("Quick sort");
        System.out.println();

        int[] arrQR = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrQR[i] = 100000+random.nextInt() % 100000;
        }
        QuickSort obQ = new QuickSort();
        tStart = System.currentTimeMillis();
        obQ.sortQ(arrQR, 0, arrQR.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrQR[i]);
        }
        System.out.println("Realistc time " + tDelta);
        System.out.println();


        int[] arrQO = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrQO[i] = i;
        }
        tStart = System.currentTimeMillis();
        obM.sort(arrQO, 0, arrQO.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;;
        for (int i = 0; i <10; i++) {
            System.out.println(arrQO[i]);
        }
        System.out.println("Opitmistic time " + tDelta);
        System.out.println();


        int[] arrQP = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrQP[i]=99999-i;
        }
        tStart = System.currentTimeMillis();
        obM.sort(arrQP, 0, arrQP.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrQP[i]);
        }
        System.out.println("Pesimitic time " + tDelta);
        System.out.println();

        System.out.println("Insert sort");
        System.out.println();
        int[] arrIR = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrIR[i] = 100000+random.nextInt() % 100000;
        }
        InsertionSort obI = new InsertionSort();
        tStart = System.currentTimeMillis();
        obI.sort(arrIR);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrIR[i]);
        }
        System.out.println("Realistc time " + tDelta);
        System.out.println();


        int[] arrIO = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrIO[i] = i;
        }
        tStart = System.currentTimeMillis();
        obI.sort(arrIO);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrIO[i]);
        }
        System.out.println("Opitmistic time " + tDelta);
        System.out.println();


        int[] arrIP = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrIP[i]=99999-i;
        }
        tStart = System.currentTimeMillis();
        obI.sort(arrIP);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrIP[i]);
        }
        System.out.println("Pesimitic time " + tDelta);
        System.out.println();
        System.out.println("Gnome sort");
        System.out.println();

        int[] arrGR = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrGR[i] = 100000+random.nextInt() % 100000;
        }
        GnomeSort obG = new GnomeSort();
        tStart = System.currentTimeMillis();
        obG.gnomeSort(arrGR, arrGR.length);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrGR[i]);
        }
        System.out.println("Realistc time " + tDelta);

        System.out.println();
        int[] arrGO = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrGO[i] = i;
        }
        tStart = System.currentTimeMillis();
        obG.gnomeSort(arrGO, arrGO.length);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrGO[i]);
        }
        System.out.println("Opitmistic time " + tDelta);
        System.out.println();


        int[] arrGP = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrGP[i]=99999-i;
        }
        tStart = System.currentTimeMillis();
        obG.gnomeSort(arrGP, arrGP.length);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        for (int i = 0; i <10; i++) {
            System.out.println(arrGP[i]);
        }
        System.out.println("Pesimitic time " + tDelta);
    }
}