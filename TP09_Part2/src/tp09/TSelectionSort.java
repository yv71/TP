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
public class TSelectionSort extends TSort{
    
    public TSelectionSort(ArrayList<Integer> tab) {
        super(tab);
    }

    public TSelectionSort(ArrayList<Integer> tab, Graphics gfx, int w, int h) {
        super(tab, gfx, w, h);
    }
    
    
    public void sort(){
        for (int i = 0; i < tab.size() -2; i++){
            int min = i;
            for (int j = i+1; j<tab.size();j++){
                if (tab.get(j)<tab.get(min)) {
                    min = j;
                }}
                if (min != i){
                    super.swap(i,min);
                }
            }
        }
    }

