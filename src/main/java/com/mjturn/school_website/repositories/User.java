package com.mjturn.school_website.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface User extends JpaRepository<com.mjturn.school_website.models.User, Long> {
}
