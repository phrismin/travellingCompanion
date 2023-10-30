package com.rudoy.travellingcompanion.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "drivers")
@Setter
@Getter
public class Driver extends User {
    @Column(name = "category")
    private String category;
    @Column(name = "driving_experience")
    private Integer drivingExperience;
    @Column(name = "driver_rank")
    private Double driverRank;
    @Column(name = "transport_info")
    private Double transportInfo;
    @OneToOne
    private Trip trip;
}
