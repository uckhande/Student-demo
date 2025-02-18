package com.example.Student_demo.controller;

import com.example.Student_demo.entity.Mark;
import com.example.Student_demo.Service.MarkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarkController {
    private final MarkService markService;

    public MarkController(MarkService markService) {
        this.markService = markService;
    }

    @GetMapping
    public List<Mark> getAllMarks() {
        return markService.getAllMarks();
    }

    @PostMapping
    public Mark addMark(@RequestBody Mark mark) {
        return markService.addMark(mark);
    }
}
