package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        //throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();

        for(int i = Math.min(left,right) ; i <= Math.max(left,right) ; i++){
            re.add(i);
        }
        if(left >= right)Collections.reverse(re);
        return re;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> re = new ArrayList<>();

        for(int i = Math.min(left,right) ; i <= Math.max(left,right) ; i++){
            if((i&1)==0) re.add(i);
        }
        if(left >= right)Collections.reverse(re);
        return re;
    }

    public List<Integer> popEvenElments(int[] array) {
       // throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        for(int i :array){
            if((i&1)==0)
                re.add(i);
        }
        return re;

    }

    public int popLastElment(int[] array) {
        //throw new NotImplementedException();
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        //throw new NotImplementedException();
        Set<Integer> hash = new HashSet<Integer>(Arrays.stream( (firstArray.length > secondArray.length ? firstArray: secondArray) ).boxed().collect(Collectors.toList()));
        List<Integer> re = new ArrayList<>();
        for(int i : firstArray.length > secondArray.length ? secondArray: firstArray){
            if(hash.contains(i))
                re.add(i);
        }
        return re;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        //throw new NotImplementedException();
        Set<Integer> hash = new HashSet<Integer>(Arrays.asList(firstArray));
        List<Integer> re = new ArrayList<Integer>();
        for(Integer i : firstArray){ re.add(i);}
        for(Integer i : secondArray){
            if(!hash.contains(i))
                re.add(i);
        }
        return re;
    }
}
