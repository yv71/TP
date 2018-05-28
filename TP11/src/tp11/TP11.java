/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11;

import java.io.IOException;

/**
 *
 * @author yv066840
 */
public class TP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Journal j = Journal.get("test");
        j.log("Salut les copaaains");
        j.efface();
        j.log("Hello back");
    }
    
}
