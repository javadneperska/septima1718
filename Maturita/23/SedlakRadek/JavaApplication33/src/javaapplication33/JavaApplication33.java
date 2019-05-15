
package javaapplication33;


public class JavaApplication33 {


    
    
            
            
    public static void main(String[] args) {
        Zivocich [] z= new Zivocich [4];
        z[0]=new Ptak("Vtak",  5);
        z[1]=new Slon("Slon", 8);
        z[2]=new Ptak("Vulture", 6);
        z[3]=new Ptak("Deagle", 7);
        
        for (Zivocich aZ : z) {
            aZ.vypisInfo();
        }
        
        
        
        
}
}

               
    
    
    
        
    
    
