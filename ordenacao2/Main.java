/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao2;

import java.util.Arrays;

/**
 *
 * @author Felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] randomico = randomizeArray();
        
        System.out.print("Merge Sort: Array randomico => ");
        new MergeSort(randomico).run();
        System.out.println(Arrays.toString(randomico));
        
        int[] randomico2 = randomizeArray();
        
        System.out.print("Quick Sort: Array randomico => ");
        new QuickSort(randomico2).run();
        System.out.println(Arrays.toString(randomico2));
    }
    
    static int[] randomizeArray(){
        int[] array = new int[30];
        for (int i = 0; i < 30; ++i){
            array[i] = (int)(Math.random()*100 + 1);
        }
        return array;
    }
}
