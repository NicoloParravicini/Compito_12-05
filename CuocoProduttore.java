/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito12_05;

/**
 *
 * @author informatica
 *///questa classe rappresenta il cuoco che deposita una certa quantità di piatti sul bancone, uno alla volta.
public class CuocoProduttore extends Thread{ 
    
    Bancone b;

    public CuocoProduttore(Bancone b) {
        this.b = b;
    }
    
    public void run(){ 
        
        try {
            sleep((int) (Math.random() * 2000));
            
        } catch (InterruptedException ex) {
        }
        
        for(int i = 0; i < 10; i++){
            try {
                sleep((int) (Math.random() * 1000));
                b.deposita();
            } catch (Exception e) {
            }
           
        }
        
    }
    
}
