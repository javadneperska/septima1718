/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.balikz;

import sk.dneperska.balikz.inybalik.Premenne;
import sk.dneperska.balikz.inybalik.rovnakyBalik;

/**
 *
 * @author Žiak
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        rovnakyBalik rb = new rovnakyBalik();
        rb.vypis();
        Premenne p = new Premenne();
        p.testMetoda();;
    }
    
}
