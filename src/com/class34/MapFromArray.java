package com.class34;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

public static void main(String[] args) {
        
        String [] names= {"Mehmet", "Alvaro", "Miriam", "Silvia","Rose","Joe"};
        
        Map<Integer, String> nameMap=new LinkedHashMap<>();
        
        int a=1;
        
        for(String name:names) {
            nameMap.put(a, name);
            a++;
        }
        System.out.println(nameMap);
        //print key and values using entrySet(loop && Iterator)
    }
}