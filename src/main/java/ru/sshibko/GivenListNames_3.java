package ru.sshibko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GivenListNames_3 {

    List<String> names = Arrays.asList("John", "Mary", "Peter", "Alice");

    public List<String> changeList(List<String> list) {
        List<String> newNames = new ArrayList<>();

        newNames = names.stream()
                .map(n -> n.substring(1))
                .sorted(Comparator.reverseOrder())
                .toList();

        return newNames;
    }

/**
    145. Given List names . Удалите первую букву из каждого имени и верните отсортированный в обратном порядке список.
    Для решения этой задачи можно использовать методы Stream API, которые предоставляет Java.*/
}
