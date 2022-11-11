package Homeworks.Lesson_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson9 {
    public static void main(String[] args) {
        String listValues = "tiger, cat, panther, cat, puma, tiger.";
        String[] words = listValues.replaceAll("[ .]", "").split(",");
        Set<String> uniqList = new HashSet<>(Arrays.asList(words));
        for (String values : uniqList) {
            System.out.println(values.substring(0, 1).toUpperCase() + values.substring(1));
        }
    }
}
