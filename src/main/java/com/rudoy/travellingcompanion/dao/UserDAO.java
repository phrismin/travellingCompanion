package com.rudoy.travellingcompanion.dao;

import com.rudoy.travellingcompanion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
