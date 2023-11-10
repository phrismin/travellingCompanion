package com.rudoy.travellingcompanion.service.impl;

import com.rudoy.travellingcompanion.dao.DriverDAO;
import com.rudoy.travellingcompanion.dao.UserDAO;
import com.rudoy.travellingcompanion.dao.UserRoleDAO;
import com.rudoy.travellingcompanion.model.Driver;
import com.rudoy.travellingcompanion.model.User;
import com.rudoy.travellingcompanion.model.UserRole;
import com.rudoy.travellingcompanion.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final DriverDAO driverDAO;
    private final UserRoleDAO userRoleDAO;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean createDriver(Driver driver) {
        User user = userDAO.findByLogin(driver.getLogin());
        if (user != null) {
            return false;
        }
        driver.setRegistrationDate(LocalDateTime.now());
        Optional<UserRole> role = userRoleDAO.findByRole("ROLE_DRIVER");
        if (!role.isPresent()) {
            return false;
        }
        driver.setRole(role.get());
        driver.setIsEnabled(true);
        driver.setPassword(passwordEncoder.encode(driver.getPassword()));

        driverDAO.save(driver);
        return true;
    }
}
