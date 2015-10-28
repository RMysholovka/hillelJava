package HomeWork.collectionsExample;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

/**
 * Created by ${Roman} on 25.10.2015.
 */
public class StatisticLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = addIntegersLinkedList();

        timeToSetTheEnd(list);

        timeToSetFirst(list);

        timeToContains(list);

        timeToGet(list);

        timeToRemoveStart(list);

        timeToRemoveMiddle(list);

        timeToRemoveEnd(list);
    }


    public static LinkedList<Integer> addIntegersLinkedList() {
        LinkedList<Integer> list = new LinkedList();

        for (int i = 0; i < 9999999; i++) {

            list.add(i);

        }

        return list;
    }

    public static Duration timeToSetTheEnd(LinkedList<Integer> list) {

        Instant begin = Instant.now();
        list.set(9999997, 333);
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run when set to the end: " + milliseconds);
        return milliseconds;
    }


    public static void timeToSetFirst(LinkedList<Integer> list) {
        Instant begin = Instant.now();
        list.set(0, 333);
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run when set to first: " + milliseconds);
    }


    public static void timeToContains(LinkedList<Integer> list) {
        Instant begin = Instant.now();
        list.contains(9898989);
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Contains: " + milliseconds);
    }


    public static void timeToGet(LinkedList<Integer> list) {
        Instant begin = Instant.now();
        list.get(9898979);
        Instant end = Instant.now();

        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Get: " + milliseconds);
    }

    public static void timeToRemoveEnd(LinkedList<Integer> list) {
        Instant begin = Instant.now();
        list.remove((Object) 9898979);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Remove at the end: " + milliseconds);


    }

    public static void timeToRemoveStart(LinkedList<Integer> list) {
        Instant begin = Instant.now();
        list.remove((Object) 1);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Remove at Start: " + milliseconds);
    }

    public static void timeToRemoveMiddle(LinkedList<Integer> list) {
        Instant begin = Instant.now();
        list.remove((Object) 9595);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);

        System.out.println("Time to run Remove at Middle: " + milliseconds);
    }
}
