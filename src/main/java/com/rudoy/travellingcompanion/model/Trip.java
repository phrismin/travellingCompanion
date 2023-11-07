package com.rudoy.travellingcompanion.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "trips")
@Setter
@Getter
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "start_trip")
    private LocalDateTime startTrip;
    @Column(name = "create_trip")
    private LocalDateTime createTrip;
    @Column(name = "from_point")
    private String fromPoint;
    @Column(name = "to_point")
    private String toPoint;
    @Column(name = "free_seat_count")
    private Integer freeSeatCount;
    @Column(name = "transport_info")
    private String transportInfo;
    @Column(name = "view_count")
    private Integer viewCount;
    @Column(name = "trip_info")
    private String tripInfo;
    @ManyToOne
    private Driver driver;
    @ManyToOne
    private Passenger passenger;
}