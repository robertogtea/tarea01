/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.ArrayList;

/**
 *
 * @author luisza
 */
public class DemoArrayList {
    
     public void Test_ArrayList(){
         //http://www.tutorialspoint.com/java/java_arraylist_class.htm
        ArrayList mylist = new ArrayList();
          // create an array list
          ArrayList al = new ArrayList();
          System.out.println("Initial size of al: " + al.size());

          // add elements to the array list
          al.add("C");
          al.add("A");
          al.add("D");
          al.add("F");
          al.add(1, "A2");
          System.out.println("Primer elemento: "+al.get(0));
          System.out.println("Tamanio despues de agregar: " + al.size());

          // display the array list
          System.out.println("\nContenido de la lista: " + al);
          // eliminando elementos de un array list
          al.remove("F"); // por valor
          al.remove(2); // por indice
          System.out.println("\ntamanio despues de eliminar F y A: " + al.size());
          // Pop
          al.remove(al.size()-1);
          System.out.println("Contenido: " + al);
    } 

    
}
