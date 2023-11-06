package com.rudoy.travellingcompanion.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    private String transportInfo;
    @OneToMany(mappedBy = "driver")
    private List<Trip> trips = new ArrayList<>();
}
