/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5.sk.dneperska.baliky;

/**
 *
 * @author Žiak
 */
public class RovnakyBalik {
   Premenne p = new Premenne();
   
   public void testMetoda(){
        System.out.println(p.getPrivateCislo());
        System.out.println(p.meno);
        System.out.println(p.protectedNum);
        System.out.println(p.publicBln);
    }
}
