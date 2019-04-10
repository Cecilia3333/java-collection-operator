package com.thoughtworks.collection;

import org.apache.commons.collections.list.AbstractLinkedList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
       // throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        for(Integer i : array ){
            re.add(i*3);
        }
        return re;
    }

    public List<String> mapLetter() {
       // throw new NotImplementedException();
        List<String> re = new ArrayList<>();
        for(Integer i : array ){
            re.add(letterList.get(i-1));
        }
        return re;
    }

    public List<String> mapLetters() {
       // throw new NotImplementedException();
        List<String> re = new ArrayList<>();
        for(Integer i : array ){
                String s = new String();
             //   int a = (i%26);
                while(i > 0){
                   // System.out.println(i+"--string:"+letterList.get((i%26-1)==-1?0:i%26-1));
                    if((i%26-1)==-1) {
                        s = letterList.get(25) + s;
                        i = i - 25;
                    }else{
                        s=letterList.get(i%26-1)+s;
                    }
                    i/=26;
                }
                re.add(s);
        }
        return re;
    }

    public List<Integer> sortFromBig() {
        //throw new NotImplementedException();
        Collections.sort(array, (Integer p1,Integer p2) -> (p1 > p2 ? -1 : 1 ));
        return array;
    }

    public List<Integer> sortFromSmall() {
      //  throw new NotImplementedException();
        Collections.sort(array, (Integer p1,Integer p2) -> (p1 > p2 ? 1 : -1 ));
        return array;
    }
}
