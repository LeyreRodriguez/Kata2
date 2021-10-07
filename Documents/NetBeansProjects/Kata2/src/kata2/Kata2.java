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
        //Map<Integer, Integer> data = new HashMap<Integer, Integer>();
        int[] data = {4,2,3,6,8,4,7,8,5,6,7,4,8,5,0};
        
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        /*
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        */
        
        for (int i = 0; i < data.length; i++) {
            
            
            if (histogram.keySet().contains(data[i] )){
                histogram.put(data[i], histogram.get(data[i]) +1);                
            }else{
                histogram.put(data[i],1);
            }

        }
      
        for(Integer key : histogram.keySet()){
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
}
        