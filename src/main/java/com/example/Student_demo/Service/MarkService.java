package com.example.Student_demo.Service;

import com.example.Student_demo.entity.Mark;
import com.example.Student_demo.repository.MarkRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarkService {
    private final MarkRepository markRepository;
    @Autowired
    public MarkService(MarkRepository markRepository) {
        this.markRepository = markRepository;
    }

    public List<Mark> getAllMarks() {
        return markRepository.findAll();
    }

    public Mark addMark(Mark mark) {
        return markRepository.save(mark);
    }
}
