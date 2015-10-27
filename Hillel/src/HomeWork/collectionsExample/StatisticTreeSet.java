package HomeWork.collectionsExample;

import java.time.Duration;
import java.time.Instant;
import java.util.TreeSet;

/**
 * Created by ${Roman} on 25.10.2015.
 */
public class StatisticTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> list = addIntegersTreeSet();

        timeToCeilingEnd(list);

        timeToGetFirst(list);

        timeToContains(list);

        timeToGetLast(list);

        timeToRemoveStart(list);

        timeToRemoveMiddle(list);

        timeToRemoveEnd(list);
    }


    public static TreeSet<Integer> addIntegersTreeSet() {
        TreeSet<Integer> list = new TreeSet();

        for (int i = 0; i < 9999999; i++) {

            list.add(i);

        }

        return list;
    }

    public static void timeToCeilingEnd(TreeSet<Integer> list) {

        Instant begin = Instant.now();
        list.ceiling(9999997);
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run ceiling to the end: " + milliseconds);

    }


    public static void timeToGetFirst(TreeSet<Integer> list) {
        Instant begin = Instant.now();
        list.first();
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run when get to first: " + milliseconds);
    }


    public static void timeToContains(TreeSet<Integer> list) {
        Instant begin = Instant.now();
        list.contains(9898989);
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Contains: " + milliseconds);
    }


    public static void timeToGetLast(TreeSet<Integer> list) {
        Instant begin = Instant.now();
        list.last();
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run when get to last: " + milliseconds);
    }

    public static void timeToRemoveEnd(TreeSet<Integer> list) {
        Instant begin = Instant.now();
        list.remove((Object) 9898979);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Remove at the end: " + milliseconds);


    }

    public static void timeToRemoveStart(TreeSet<Integer> list) {
        Instant begin = Instant.now();
        list.remove((Object) 1);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Remove at Start: " + milliseconds);
    }

    public static void timeToRemoveMiddle(TreeSet<Integer> list) {
        Instant begin = Instant.now();
        list.remove((Object) 9595);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Remove at Middle: " + milliseconds);
    }
}

