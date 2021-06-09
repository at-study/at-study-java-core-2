package lections.lesson6.maps.schoolman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        List<Lesson> mondayLessons = Arrays.asList(Lesson.MATH, Lesson.PHYSICS, Lesson.CHEMISTRY);
        List<Lesson> tuesdayLessons = Arrays.asList(Lesson.PHYSICS, Lesson.PHYSICS, Lesson.PHYSICS);
        List<Lesson> wednesdayLessons = Arrays.asList(Lesson.CHEMISTRY, Lesson.CHEMISTRY, Lesson.CHEMISTRY);
        List<Lesson> thursdayLessons = Arrays.asList(Lesson.MATH, Lesson.MATH, Lesson.MATH);
        List<Lesson> fridayLessons = Arrays.asList(Lesson.HISTORY, Lesson.HISTORY, Lesson.HISTORY);
        List<Lesson> saturdayLessons = Arrays.asList(Lesson.MATH);

        Map<Day, List<Lesson>> diaryWeek = new HashMap<>();
        diaryWeek.put(Day.MONDAY, mondayLessons);
        diaryWeek.put(Day.TUESDAY, tuesdayLessons);
        diaryWeek.put(Day.WEDNESDAY, wednesdayLessons);
        diaryWeek.put(Day.THURSDAY, thursdayLessons);
        diaryWeek.put(Day.FRIDAY, fridayLessons);
        diaryWeek.put(Day.SATURDAY, saturdayLessons);

        List<Map<Day, List<Lesson>>> diary = new ArrayList<>();
        diary.add(diaryWeek);
        diary.add(diaryWeek);
        diary.add(diaryWeek);
        diary.add(diaryWeek);
        diary.add(diaryWeek);
        diary.add(diaryWeek);

        // Как получить урок, который был третьим в четверг на 2ой неделе?
        Lesson lesson = diary.get(1).get(Day.THURSDAY).get(2);

        // Как посчитать общее количество уроков в данном дневнике?
        int lessonCount = 0;
        for (Map<Day, List<Lesson>> page : diary) {
            for (Map.Entry<Day, List<Lesson>> day : page.entrySet()) {
                lessonCount += day.getValue().size();
            }
        }
        System.out.println("Всего уроков в дневнике: " + lessonCount);

        // Как посчитать количество каждого из уроков на первой неделе?
        Map<Lesson, Integer> counters = new HashMap<>();
        for (Lesson currentLesson : Lesson.values()) {
            int currentLessonCounter = 0;
            for (Map.Entry<Day, List<Lesson>> day : diaryWeek.entrySet()) {
                List<Lesson> dayLessons = day.getValue();
                for (Lesson current : dayLessons) {
                    if (current == currentLesson) {
                        currentLessonCounter++;
                    }
                }
            }
            counters.put(currentLesson, currentLessonCounter);
        }
        System.out.println(counters);
    }

}
