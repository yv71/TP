/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import java.util.ArrayList;

/**
 *
 * @author yv066840
 */
public class TSort {
    protected ArrayList<Integer> tab;

    public TSort(ArrayList<Integer> tab) {
        this.tab = tab;
    }
    
    public void swap(int i, int j){
        int temp = tab.get(i);
        tab.set(i, tab.get(j));
        tab.set(j, temp);
    }

    public ArrayList<Integer> getTab() {
        return tab;
    }
    
    
}
