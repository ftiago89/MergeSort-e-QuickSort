
package ordenacao2;


public class QuickSort {
    private int[] A;
    
    public QuickSort(int[] entry){
        this.A = entry;
    }
    
    public void run(){
        int l = 0;
        int r = this.A.length-1;
        QuickSort(A, l, r);
    }
    
    private void QuickSort(int[] A, int l, int r){
        if (l < r){
            int q = partition(A, l, r);
            QuickSort(A, l, q-1);
            QuickSort(A, q+1, r);   
        }
    }
    
    private int partition(int[] A, int l, int r){
        int pivo = A[r];
        int i = l - 1;
        
        for (int j = l; j < r; ++j){
            if (A[j] <= pivo){
                ++i;
                swap(A, i, j);
            }
        }
        ++i;
        swap(A, i, r);
        
        return i; 
    }
    
    //funcao para trocar os elementos i e j de um array
    private void swap(int[] array, int i, int j){
        int aux;
        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
