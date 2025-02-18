package com.example.Student_demo.repository;


import com.example.Student_demo.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
