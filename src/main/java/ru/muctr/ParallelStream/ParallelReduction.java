package ru.muctr.ParallelStream;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

/**
 * @author Evgenia Skichko
 */
public class ParallelReduction {
    public static void main(String[] args) {
//        System.out.println(List.of(1, 2, 3, 4)
//                .stream()
//                .reduce(100, (acc, el) -> acc + el));

        //Метод reduce(identity, accumulator, combiner)
//        System.out.println(List.of(1, 2, 3, 4)
//                .parallelStream()
//                .reduce(100, (acc, el) -> acc + el, (i1, i2) -> i1 + i2));

//        System.out.println(List.of("J", "A", "V", "A")
//                .parallelStream()
//                .reduce(" love ", (acc, el) -> acc + el));

        //Метод collect(supplier, accumulator, combiner)
        System.out.println(List.of(1, 2, 3, 4, 4,4,4,5, 6, 7, 8)
                .parallelStream()
                .collect(ConcurrentSkipListSet::new,
                        Set::add,
                        Set::addAll)
                .toString());



    }
}
