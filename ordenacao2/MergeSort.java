
package ordenacao2;

import java.util.Arrays;


public class MergeSort {
    private int[] A;
    
    public MergeSort(int[] entry){
        this.A = entry;
    }
    
    public void run(){
        int p = 0;
        int r = this.A.length-1;
        mergeSort(A, p, r);
    }
    
    private void mergeSort(int[] A, int p, int r){

        if (p < r){
            int q = (p + r)/2;
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
        }
    }
    
    private void merge(int[] A, int p, int q, int r){
        int[] L = null, R = null;
        
        //dividindo A pela metade e colocando em L e R
        L = Arrays.copyOfRange(A, p, q+2);
        R = Arrays.copyOfRange(A, q+1, r+2);
        
        //Adicionando infinito no final de L e R
        L[L.length-1] = Integer.MAX_VALUE;
        R[R.length-1] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        
        for (int k = p; k <= r; ++k){
            if (L[i] < R[j]){
                A[k] = L[i];
                ++i;
            }else{
                A[k] = R[j];
                ++j;
            }
        }
    }
    
}
