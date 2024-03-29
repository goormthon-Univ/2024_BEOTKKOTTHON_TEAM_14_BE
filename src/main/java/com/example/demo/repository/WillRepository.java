package com.example.demo.repository;

import com.example.demo.domain.will.Will;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WillRepository extends JpaRepository<Will, Long> {
    Optional<Will> findByUserId(Long user_id);
}