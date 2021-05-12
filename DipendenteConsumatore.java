/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito12_05;

/**
 *
 * @author informatica
 */
//il dipendente preleva i piatti ogni volta che il cuoco ne deposita uno.
public class DipendenteConsumatore extends Thread {
    
    Bancone b;

    public DipendenteConsumatore(Bancone b) {
        this.b = b;
    }
    
    public void run(){ 
        
        try {
            sleep((int) (Math.random() * 1000));
        } catch (InterruptedException ex) {
        }
        
        b.preleva();
    }
}
