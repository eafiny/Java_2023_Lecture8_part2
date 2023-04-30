package ru.muctr.ConcurrentCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hashset = new ConcurrentSkipListSet<>();
        for (int i = 0; i <11; i++){
            hashset.add(i);
        }

        Iterator<Integer> itr =  hashset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            hashset.add(1000);
        }
    }
}
