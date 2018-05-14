/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author yv066840
 */
public class TQuickSort extends TSort{
    
    public TQuickSort(ArrayList<Integer> tab) {
        super(tab);
    }

    public TQuickSort(ArrayList<Integer> tab, Graphics gfx, int w, int h) {
        super(tab, gfx, w, h);
    }
    
    public void sort(){
        tri_rapide(0,tab.size()-1);
    }
    private int partitioner(int premier, int dernier, int pivot){
        swap(pivot,dernier);
        int j = premier;
        for (int i = premier;i < dernier ;i++){
            if (tab.get(i)<= tab.get(dernier)){
                swap(i,j);
                j+= 1;
            }
            
        }
      swap(dernier,j);
      return j;
    }
    
    private void tri_rapide(int premier, int dernier){
        if (premier < dernier) {
            int pivot = (premier+dernier)/2;
            pivot = partitioner (premier,dernier,pivot);
            tri_rapide(premier,pivot-1);
            tri_rapide(pivot+1,dernier);
        }
    }
}
