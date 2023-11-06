package com.rudoy.travellingcompanion.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
@Setter
@Getter
public class Passenger extends User {
    @Column(name = "passenger_rank")
    private Double passengerRank;
    @OneToMany(mappedBy = "passenger")
    private List<Trip> trips = new ArrayList<>();
}
