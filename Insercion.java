/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class Insercion 
{
    public static void main(String[] args) {
        int[] array = {3,6,2,5,3};
        int pos,aux;
        for(int i = 0 ; i<array.length ; i++)
        {
            pos = i; //Flechita que va recorriendo
            aux = array[i];
            while(pos>0 && array[pos-1] > aux)
            {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos]=aux;
        }
       for(int j = 0 ; j<6 ; j++)
       {
           System.out.println(array[j]);
       }
    }
}
