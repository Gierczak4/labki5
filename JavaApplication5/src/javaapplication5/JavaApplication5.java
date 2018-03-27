/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.HashMap;

/**
 *
 * @author Student
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1,1250);
        map.put(2,1260);
        map.put(3,1270);
        map.put(4,1280);
        System.out.println(map);
        
        HashMap<Integer,Integer> map2 = new HashMap();
        for(Integer key : map.keySet())
        {
            Integer value = map.get(key);
            map2.put(value,key);
        }
        System.out.println(map2);
        
    }
    
}
