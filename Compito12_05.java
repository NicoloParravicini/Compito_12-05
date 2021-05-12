/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito12_05;

import static java.lang.Thread.sleep;

/**
 *
 * @author informatica
 */
public class Compito12_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Bancone ba = new Bancone();
        
        CuocoProduttore c = new CuocoProduttore(ba);
        c.start();
        
        for(int i = 0; i < 10; i++){
            
            DipendenteConsumatore dipendente = new DipendenteConsumatore(ba);
            dipendente.start();
        }
        
         for(int i = 0; i < 10; i++){
            
            DipendenteConsumatore dipendente = new DipendenteConsumatore(ba);
            dipendente.join();
        }
         
         c.join();
         
         try { 
             sleep ((int) (Math.random() * 2000));
            System.out.println("Fine pausa pranzo");
        } catch (Exception e) {
        }
         
    }
    
}
