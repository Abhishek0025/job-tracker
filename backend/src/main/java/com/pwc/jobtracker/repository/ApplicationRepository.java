package com.pwc.jobtracker.repository;
import com.pwc.jobtracker.entity.ApplicationStatus;
import com.pwc.jobtracker.entity.JobApplication;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<JobApplication, Long> {
    List<JobApplication> findByUser(Long userId);
    long countByUserIdAndStatus(Long userId, ApplicationStatus status);
}
