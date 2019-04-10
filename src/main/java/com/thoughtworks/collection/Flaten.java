package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
       // throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        for(Integer [] i : array) {
            for (Integer j : i) {
                re.add(j);
            }
        }
        return re;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
      //  throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        Set<Integer> hash = new HashSet<>();
        for(Integer [] i : array) {
            for (Integer j : i) {
                if(!hash.contains(j)) re.add(j);
                hash.add(j);
            }
        }
        return re;
    }
}
