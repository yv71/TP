/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;
import java.util.*;
/**
 *
 * @author yv066840
 */
public class TP09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> Test = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            Test.add((int)(Math.random()*100));
        }
        System.out.println(Test);
        TBubblleSort triBulle = new TBubblleSort(Test);
        triBulle.sort();
        System.out.println(triBulle.getTab());
        TSelectionSort triSelection = new TSelectionSort(Test);
        triSelection.sort();
        System.out.println(triSelection.getTab());
        TQuickSort triRapide = new TQuickSort(Test);
        triRapide.sort();
        System.out.println(triRapide.getTab());
    }
    
}
