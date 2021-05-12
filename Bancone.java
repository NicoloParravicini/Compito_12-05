/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito12_05;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone { //questa classe rappresenta il buffer, è una classe condivisa, vengono depositati e prelevati i piatti
 
    Semaphore vuoto = new Semaphore(1);
    Semaphore pieno = new Semaphore(0);
    
    int numeroProgressivo = 1;


    //Il cuoco deposita un piatto sul bancone
    public void deposita(){ 
        
        
        try {
            
            vuoto.acquire();
        } catch (InterruptedException ex) {
        }
        
        System.out.println("Il piatto n."+  numeroProgressivo +" è pronto");
        numeroProgressivo++;
        pieno.release();
        
    }
    
    //Il dipendente preleva il piatto dal bancone
    public void preleva(){ 
        
        try {
            
            pieno.acquire();
        } catch (InterruptedException ex) {
        }
        int progressivo = numeroProgressivo -1;
        System.out.println("Consumo: " + progressivo);
        vuoto.release();
    }
    
}
