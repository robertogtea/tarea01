/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;


/**
 *
 * @author luisza
 */
public class DemoColecciones {
    public void display_hashSet(){
        // http://www.tutorialspoint.com/java/java_hashset_class.htm
      HashSet hset = new HashSet();
      hset.add("B");
      hset.add("A");
      hset.add("D");
      hset.add("E");
      hset.add("C");
      hset.add("F");
      System.out.println(hset);
      // que pasa con hset.get()?
    }
    
    public void display_hashTable(){
        Hashtable diccionario = new Hashtable();
        Enumeration names;
        String str;
        diccionario.put("Nombre", "Carnet");
        diccionario.put("Pepito", "B92102");
        diccionario.put("Juanito", "A93201");
        System.out.println(diccionario.containsKey("Pepito"));        
        names = diccionario.keys();
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " +
            diccionario.get(str));
        }
    }
}
