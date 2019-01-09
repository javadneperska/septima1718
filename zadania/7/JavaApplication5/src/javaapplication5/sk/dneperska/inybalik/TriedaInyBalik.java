/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5.sk.dneperska.inybalik;

import javaapplication5.sk.dneperska.baliky.Premenne;

/**
 *
 * @author Žiak
 */
public class TriedaInyBalik {
    public void zavolaj(){
        Premenne pp = new Premenne();
        System.out.println(pp.publicBln);
        System.out.println(pp.getPrivateCislo());
    }

}
