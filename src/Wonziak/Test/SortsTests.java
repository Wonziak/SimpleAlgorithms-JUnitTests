package Wonziak.Test;

import Wonziak.Sorts.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
public class SortsTests {
   static int[] arr = new int[50000];
    @BeforeAll
         static void tab() {
        Random random = new Random();
        for (int i = 0; i < 50000; i++) {
            arr[i] = 50000 + random.nextInt() % 50000;
        }
    }
    @Test
    public void BubbleRealisticMaxDuration(){
         final int[] arr2=arr.clone() ;
        BubbleSort bb=new BubbleSort();
        assertTimeout(Duration.ofMillis(19000),()->{
            bb.bubbleSort(arr2);
        });
    }

    @Test
    public void GnomeRealisticMaxDuration(){
        final int[] arr2=arr.clone() ;
        GnomeSort gn=new GnomeSort();
        assertTimeout(Duration.ofMillis(9000),()->{
            gn.gnomeSort(arr2,50000);
        });
    }
    @Test
    public void InertionRealisticMaxDuration(){
        final int[] arr2=arr.clone() ;
        InsertionSort is=new InsertionSort();
        assertTimeout(Duration.ofMillis(8000),()->{
            is.sort(arr2);
        });
    }
    @Test
    public void MergeRealisticMaxDuration(){
        final int[] arr2=arr.clone() ;
        MergeSort ms=new MergeSort();
        assertTimeout(Duration.ofMillis(9000),()->{
            ms.sort(arr2,0,arr2.length-1);
        });
    }
    @Test
    public void QuickRealisticMaxDuration(){
        final int[] arr2=arr.clone() ;
        QuickSort qs=new QuickSort();
        assertTimeout(Duration.ofMillis(1000),()->{
            qs.sortQ(arr2,0,arr2.length-1);
        });
    }

    @Test
    public void isSortedBubble(){
        int[] arr2=arr.clone() ;
        int [] arr3=arr.clone();
        BubbleSort bb=new BubbleSort();
        bb.bubbleSort(arr2);
        Arrays.sort(arr3);
        assertArrayEquals(arr3,arr2);
    }

    @Test
    public void isSortedGnome(){
         int[] arr2=arr.clone() ;
         int [] arr3=arr.clone();
        GnomeSort gn=new GnomeSort();
        gn.gnomeSort(arr2,50000);
        Arrays.sort(arr3);
        assertArrayEquals(arr3,arr2);
    }

    @Test
    public void isSortedInsertion(){
         int[] arr2=arr.clone() ;
         int[] arr3=arr.clone();
        InsertionSort is=new InsertionSort();
        is.sort(arr2);
        Arrays.sort(arr3);
        assertArrayEquals(arr3,arr2);
    }
    @Test
    public void isSortedMerge(){
        int[] arr2=arr.clone() ;
        int[] arr3=arr.clone();
        MergeSort ms=new MergeSort();
        ms.sort(arr2,0,arr2.length-1);
        Arrays.sort(arr3);
        assertArrayEquals(arr3,arr2);
    }
    @Test
    public void isSortedQuick(){
        int[] arr2=arr.clone() ;
        int[] arr3=arr.clone();
        QuickSort qs=new QuickSort();
        qs.sortQ(arr2,0,arr2.length-1);
        Arrays.sort(arr3);
        assertArrayEquals(arr3,arr2);
    }
}