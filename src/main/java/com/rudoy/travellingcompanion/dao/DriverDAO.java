package com.rudoy.travellingcompanion.dao;

import com.rudoy.travellingcompanion.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverDAO extends JpaRepository<Driver, Long> {
}
