package com.rudoy.travellingcompanion.dao;

import com.rudoy.travellingcompanion.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findByRole(String role);
}
