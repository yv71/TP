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
public class TBubblleSort extends TSort{
    
    public TBubblleSort(ArrayList<Integer> tab) {
        super(tab);
    }
    
    public void sort(){
            boolean aucun_echange;
            do {
                aucun_echange = false;
                for (int j=0; j < tab.size()-1; j++ ){
                    if (tab.get(j)>tab.get(j+1)){
                        swap(j,j+1);
                        aucun_echange=true;
                    }
                }
            } while (aucun_echange);
        
    }
}
