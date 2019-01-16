/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Žiak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ziak z = new Ziak("peter", 1, 15);
        System.out.println(z.getMeno());
        System.out.println(z.getVek());
        System.out.println(z.getZnamka());
        
        Ucitel u = new Ucitel(30, "Katarina",1);
        u.dajZnamku();
        
        Human u2 = new Ucitel(35, "Jaroslav");
        System.out.println(u2.getMeno());
        System.out.println(u2.getVek());
    }
    
}
