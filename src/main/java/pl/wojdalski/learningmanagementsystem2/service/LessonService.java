package pl.wojdalski.learningmanagementsystem2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojdalski.learningmanagementsystem2.model.Lesson;
import pl.wojdalski.learningmanagementsystem2.repository.LessonRepository;

import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    public void save(Lesson Lesson) {
        lessonRepository.save(Lesson);
    }

    public void delete(Long id) {
        lessonRepository.deleteById(id);
    }

    public Lesson getLesson(Long id) {
        return lessonRepository.getOne(id);
    }
}
