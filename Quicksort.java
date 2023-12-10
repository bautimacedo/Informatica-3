/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.dava to edit this template
 */

/**
 *
 * @author bauti
 */
public class Quicksort 


{
    public static void quicksor(int array[], int izq,int der)
    {
        int pivote = array[izq];
        int i = izq;
        int d = der;
        int aux;
        
        
        while(i<d) //Mientras que no se crucen los indices
        {
            while(array[i]<=pivote && i<d) //Mientras que el elemento de la izquierda sea menorq que el pivote
                i++;
            while(array[d]>pivote) //Mientras que el elemento de la derecha sea mas grande que el pivote
                d++;
            if(i<d)
            {
                aux = array[i]; //Guardo en un temporal
                array[i]=array[d]; //Cambio
                array[d]=aux;      //Cambio
            }
        }
        array[izq] = array[d];//aseguran que todos los elementos menores o iguales al pivote estén
        array[d] = pivote;//a la izquierda del pivote y que todos los elementos mayores estén a su derecha.
        
        if(izq<d-1)
            quicksor(array,izq,d-1);
        if(d+1<der)
            quicksor(array,d+1,der);       
        
    }
    
    public static void main(String[] args) {
        
    }
    
    
    
    
    
    
    
    
    
}
