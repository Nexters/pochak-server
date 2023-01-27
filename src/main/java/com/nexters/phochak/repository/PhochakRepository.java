package com.nexters.phochak.repository;

import com.nexters.phochak.domain.Phochak;
import com.nexters.phochak.domain.Post;
import com.nexters.phochak.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhochakRepository extends JpaRepository<Phochak, Long> {
    boolean existsByUserAndPost(User user, Post post);
}
