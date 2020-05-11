package pl.wojdalski.learningmanagementsystem2.controller;

import org.springframework.web.bind.annotation.*;
import pl.wojdalski.learningmanagementsystem2.model.Lesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    private List<Lesson> lessons;

    public LessonController() {
        lessons = new ArrayList<>(Arrays.asList(
                new Lesson(1L, "Typy danych", LocalDate.of(2020, 5, 18),
                        "Podstawowe typy danych w języku Java oraz jakie wartości mogą reprezentować"),
                new Lesson(2L, "Zmienne", LocalDate.of(2020, 5, 25),
                        "Czym są zmienne, jak je deklarować i inicjalizować"),
                new Lesson(3L, "Operacje na zmiennych", LocalDate.of(2020, 6, 1),
                        "Czym są operatory matematyczne i logiczne w Javie i jak ich używać")
        ));
    }

    @GetMapping
    public List<Lesson> getAll() {
        return lessons;
    }

    @PostMapping
    public Lesson post(@RequestBody Lesson lesson) {
        long nextId = lessons.stream()
                .mapToLong(Lesson::getId)
                .max()
                .orElse(0) + 1;
        lesson.setId(nextId);
        lessons.add(lesson);
        return lesson;
    }
}


