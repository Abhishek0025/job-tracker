package com.pwc.jobtracker.repository;
import com.pwc.jobtracker.entity.Note;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByApplicationId(Long applicationId);
}
