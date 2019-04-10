package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.management.ObjectName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.*;




public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        //throw new NotImplementedException();
        return (int) Collections.max(arrayList);
    }

    public double getMinimum() {
       // throw new NotImplementedException();
        return (int) Collections.min(arrayList);
    }

    public double getAverage() {
        //throw new NotImplementedException();


        return arrayList.stream().mapToLong(Integer::longValue).average().getAsDouble();
    }

    public double getOrderedMedian() {
      //  throw new NotImplementedException();
        Collections.sort(arrayList);
        if (arrayList.size() % 2 == 0) {
             return (double) (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2;
        } else {
            return arrayList.get(arrayList.size() / 2);
        }
    }

    public int getFirstEven() {
       // throw new NotImplementedException();
        for(Integer i : arrayList){
            if(i%2==0)
                return i;
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        //throw new NotImplementedException();
        for(int i = 0 ; i < arrayList.size() ; i++ ){
            if(arrayList.get(i)%2==0)
                return i;
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
       //    throw new NotImplementedException();

        return this.arrayList.equals(arrayList);
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
       // throw new NotImplementedException();
        if(arrayList.size()%2==0) {
            return (double) ((int) singleLink.getNode(arrayList.size() / 2) + (int) singleLink.getNode(arrayList.size() / 2 + 1)) / 2;
        }else {
            return (double)(int)singleLink.getNode(arrayList.size()/2 + 1) ;
        }
    }

    public int getLastOdd() {
       // throw new NotImplementedException();
        for(int i = arrayList.size()-1 ; i >= 0 ; i-- ){
            if(arrayList.get(i)%2==1)
                return arrayList.get(i);
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        for(int i = arrayList.size()-1 ; i >= 0 ; i-- ){
            if(arrayList.get(i)%2==1)
                return i;
        }
        return -1;
    }
}
