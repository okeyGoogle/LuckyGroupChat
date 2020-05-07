package com.tallgram.repo;

import com.tallgram.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alen on 02.05.2020.
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
