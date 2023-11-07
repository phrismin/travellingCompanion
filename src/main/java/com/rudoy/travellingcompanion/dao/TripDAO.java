package com.rudoy.travellingcompanion.dao;

import com.rudoy.travellingcompanion.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripDAO extends JpaRepository<Trip, Long> {
}
