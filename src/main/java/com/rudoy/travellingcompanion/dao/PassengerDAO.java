package com.rudoy.travellingcompanion.dao;

import com.rudoy.travellingcompanion.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerDAO extends JpaRepository<Passenger, Long> {
}
