package com.dashboard.maicosoft.repository;

import com.dashboard.maicosoft.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}



