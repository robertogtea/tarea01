/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author luisza
 */
public class Clase1 {
       
    /**
     * 
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoArrayList dal = new DemoArrayList();
        dal.Test_ArrayList();
        
        
        DemoColecciones dc = new DemoColecciones();
        dc.display_hashSet();
        dc.display_hashTable();
        DemoJTable djt = new DemoJTable();
        djt.setVisible( true );
        
    }
    
}
