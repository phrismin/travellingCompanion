package com.rudoy.travellingcompanion.dao;

import com.rudoy.travellingcompanion.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoDAO extends JpaRepository<Photo, Long> {
}
