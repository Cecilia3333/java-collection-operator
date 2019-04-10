package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        //throw new NotImplementedException();
        List<Integer> re = new ArrayList<>();

        while(number - random.nextInt(3) >=0){
            number = number - random.nextInt(3);
            re.add(number);

        }
        return re;
    }
}
