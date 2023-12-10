/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class OrdenamientoQuicksort {
    
    
    public void quicksort(int[]array,int left,int right)
    {
        int i,j,temp;
        i=left;
        j=right;
        do
        {
            while(j>i && array[i] < array[j]) j--;
            if(i<j)
            {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
            }
            while(j>i && array[i] < array[j])i++;
            if(i<j)
            {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                j--;
            }
        }while(i<j);
        if(left<j) quicksort(array,left,j-1);
        if(right>i) quicksort(array,i+1,right);
        
    }
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        OrdenamientoQuicksort h = new OrdenamientoQuicksort();
        h.quicksort(arr, 0, arr.length-1);
        System.out.println("Arreglo antes de ordenar:");
        imprimirArreglo(arr);
        
        //quicksort(arr,0,arr.length-1);
        
        System.out.println("Arreglo después de ordenar:");
        imprimirArreglo(arr);
    }
}
