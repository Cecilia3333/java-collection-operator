package com.thoughtworks.collection;

import org.apache.commons.collections.bag.AbstractBagDecorator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0;
        for(int i = Math.min(leftBorder,rightBorder);i <= Math.max(leftBorder,rightBorder); i++){
            if((i&1)==0){
                 sum+=i;
            }
        }
        return sum;
       // throw new NotImplementedException();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum=0;
        for(int i = Math.min(leftBorder,rightBorder);i <= Math.max(leftBorder,rightBorder); i++){
            if((i&1)==1){
                sum+=i;
            }
        }
        return sum;
      //  throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for(Integer i : arrayList) {
            sum+=(i*3+2);
        }
        return sum;
        //throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> re = new ArrayList<>();
        for(Integer i : arrayList) {
            if((i&1)==1){
                re.add(i*3+2);
            }else{
                re.add(i);
            }
        }
        return re;
       // throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum=0;
        for(Integer i : arrayList) {
            if((i&1)==1){
                sum+=i*3+5;
            }
        }
        return sum;
        //throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {

        List<Integer> temp = new ArrayList<>();
        for(Integer i : arrayList) {
            if ((i & 1) == 0) {
                temp.add(i);
            }
        }
        Collections.sort(temp);
        if(temp.size()%2==1)
            return temp.get(temp.size()/2 );
        else
            return (temp.get(temp.size()/2 -1) + temp.get(temp.size()/2))/2;
       // throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //throw new NotImplementedException();
        double re = 0;
        int count = 0;
        for(Integer i : arrayList) {
            if ((i & 1) == 0) {
                re+=i;
                count++;
            }
        }
        return re/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
       // throw new NotImplementedException();
        for(Integer s: arrayList){
            if ((s & 1) == 0) {
                if (s.equals(specialElment))
                    return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();
        for(Integer  i : arrayList){
            if((i&1)==0){
                if(re.contains(i));
                else
                    re.add(i);
            }
        }
        return re;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
       // throw new NotImplementedException();
        Integer [] re = new Integer[arrayList.size()];
        int end = arrayList.size()-1;
        int start = 0;
        for(Integer i : arrayList){
            if((i&1)==0){
                re[start++]=i;
            }else{
                re[end--]=i;
            }
        }
        return  Arrays.asList(re);
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> re = new ArrayList<>();
        for(int i = 0; i < arrayList.size()-1 ; i++){
            re.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return re;
        //throw new NotImplementedException();
    }
}
