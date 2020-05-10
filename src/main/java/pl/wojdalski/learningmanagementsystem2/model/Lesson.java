package pl.wojdalski.learningmanagementsystem2.model;


import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

public class Lesson {

    private Long id;

    private String subject;

    @DateTimeFormat(iso = DATE)
    private LocalDate date;

    private String description;

    public Lesson(Long id, String subject, LocalDate date, String description) {
        this.id = id;
        this.subject = subject;
        this.date = date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
