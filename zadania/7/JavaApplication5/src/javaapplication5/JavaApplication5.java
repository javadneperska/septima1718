/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javaapplication5.sk.dneperska.baliky.*;
import javaapplication5.sk.dneperska.inybalik.TriedaInyBalik;

/**
 *
 * @author Žiak
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        RovnakyBalik rb = new RovnakyBalik();
      //  Premenne p = new Premenne();
        rb.testMetoda();;
        
        TriedaInyBalik tb = new TriedaInyBalik();
        tb.zavolaj(); 
    }
    
}
