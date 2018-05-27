/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rampacek
 */
public abstract class TSort implements Runnable {

    protected ArrayList<Integer> tab;
    private Graphics gfx;
    private int width, height;

    private Color bgColor = new Color(255, 255, 204);
    private Color fgColor = Color.RED;

    public ArrayList<Integer> getTab() {
        return tab;
    }
    
    public TSort(ArrayList<Integer> tab) {
        this.tab = tab;
        this.gfx = null;
    }
    
    public TSort(ArrayList<Integer> tab, Graphics gfx, int w, int h) {
        this.tab = tab;
        this.gfx = gfx;
        this.width = w;
        this.height = h;
        PeindreGfx();
    }
    
    public void swap(int i, int j) {
        if (gfx != null) {
            int FI = i;
            int FJ = j;
            int FA = tab.get(i);
            int FB = tab.get(j);
            gfx.setColor(bgColor);
            gfx.drawLine(1, FI+1, FA, FI+1);
            gfx.drawLine(1, FJ+1, FB, FJ+1);
            gfx.setColor(fgColor);
            gfx.drawLine(1, FI+1, FB, FI+1);
            gfx.drawLine(1, FJ+1, FA, FJ+1);
        }

        int tmp = tab.get(i);
        tab.set(i, tab.get(j));
        tab.set(j, tmp);

        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
        }
        
    }
    
    public abstract void sort();
    
    public void run() {
        sort();
    }
    
    private void PeindreGfx() {
        // peindre le fond en jaune clair
        gfx.setColor(bgColor);
        gfx.fillRect(0,0, width-1, height-1);

        // peindre le contour en noir
        gfx.setColor(Color.BLACK);
        gfx.drawRect(0,0, width-1, height-1);

        // afficher les tableaux non triés
        gfx.setColor(fgColor);
        for (int i=0 ; i<(height-2) ; i++) {
            gfx.drawLine(1, i+1, tab.get(i), i+1);
        }
        
    }

    
}
