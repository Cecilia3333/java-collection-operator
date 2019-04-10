package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
       // throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        for(Integer i : array){
            if(i%2==0) re.add(i);
        }
        return re;
    }

    public List<Integer> filterMultipleOfThree() {
        //throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        for(Integer i : array){
            if(i%3==0) re.add(i);
        }
        return re;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //throw new NotImplementedException();
        Set<Integer> hash = new HashSet<Integer>(firstList.size() > secondList.size() ? firstList: secondList);
        List<Integer> re = new ArrayList<>();
        for(int i : firstList.size() > secondList.size() ? secondList: firstList){
            if(hash.contains(i))
                re.add(i);
        }
        return re;
    }

    public List<Integer> getDifferentElements() {
       // throw new NotImplementedException();
        Set<Integer> hash = new HashSet<>(array);
        List<Integer> re =new ArrayList<>(hash);
        return re;

    }
}