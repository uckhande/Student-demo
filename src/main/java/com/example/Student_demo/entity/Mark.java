package com.example.Student_demo.entity;


import jakarta.persistence.*;

@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private int score; // Marks obtained

    public boolean isPass() {
        return score >= 40; // Assuming 40 as the passing mark
    }
}
