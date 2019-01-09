/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.balikz.inybalik;

/**
 *
 * @author Žiak
 */
public class Premenne {

   private int privateCislo = 10;
   String meno = "cccc";
   protected double protectedNum = 3.14;
   public boolean publicBln = true;
   
    public Premenne() {
    }
    
    public void testMetoda(){
        System.out.println(privateCislo);
        System.out.println(meno);
        System.out.println(protectedNum);
        System.out.println(publicBln);
    }
}
