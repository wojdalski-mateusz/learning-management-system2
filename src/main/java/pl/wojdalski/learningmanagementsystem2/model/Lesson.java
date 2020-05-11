package pl.wojdalski.learningmanagementsystem2.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;
import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = IDENTITY)
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

    public Lesson() {
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
