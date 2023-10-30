package com.rudoy.travellingcompanion.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
@Setter
@Getter
public class Passenger extends User {
    @Column(name = "passenger_rank")
    private Double passengerRank;
    @ManyToMany
    private List<Trip> passengers = new ArrayList<>();
}
