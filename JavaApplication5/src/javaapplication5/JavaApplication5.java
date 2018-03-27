/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Student
 */
public class JavaApplication5 {

    public static HashMap<Integer,Integer>zlozenie(
                  HashMap<Integer,Integer>f,
                  HashMap<Integer,Integer>g)
    {
         HashMap<Integer,Integer> wynik = new HashMap();
         for(Integer key : f.keySet())
         {
             Integer value = f.get(key);
             wynik.put(key,g.get(value));
         }
         return wynik;
    }                                                          //zadanie 3a
            
            
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
        System.out.println(map2);             //zadanie 1 zamiana value z key
        
        
        ArrayList<Integer> list = new ArrayList();
        for(Integer key : map.keySet())
        {
            Integer value = map.get(key);
            list.add(key);
            list.add(value);
        }
        System.out.println(list);        //zadanie 2a zestaw 2 lub za pomoca addALL
        
        
        HashMap<Integer,Integer> f = new HashMap();
        f.put(1,1250);
        f.put(2,1260);
        f.put(3,1270);
        f.put(4,1280);
        System.out.println(f);
        HashMap<Integer,Integer> g = new HashMap();
        g.put(1250,88);
        g.put(1260,89);
        g.put(1270,90);
        g.put(1280,91);
        System.out.println(g);
        HashMap<Integer,Integer> zlozenie = new HashMap();
        zlozenie.put(1,88);
        zlozenie.put(2,89);
        zlozenie.put(3,90);
        zlozenie.put(4,91);
        System.out.println(zlozenie);                            //zadanie3a
        HashMap<Integer,Integer> w = zlozenie(f,g); 
        System.out.println(w);
        
        
        
        
    }
    
}
