/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

/**
 *
 * @author campitos
 */
public class TestThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Facil t1=new Facil();
        Medio m=new Medio();
        Thread t2=new Thread(m);
        t1.start();
        t2.start();
        
       
    }
    
}
