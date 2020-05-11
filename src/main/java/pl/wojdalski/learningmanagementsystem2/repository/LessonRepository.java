package pl.wojdalski.learningmanagementsystem2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wojdalski.learningmanagementsystem2.model.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
