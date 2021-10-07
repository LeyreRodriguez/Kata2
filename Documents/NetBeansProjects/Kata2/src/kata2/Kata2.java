/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
        
    public static void main(String[] args) {
        
        Integer[] data = {4,2,3,6,8,4,7,8,5,6,7,4,8,5,0};
        
        
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();

           
        for(Integer key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
    
}

    
        