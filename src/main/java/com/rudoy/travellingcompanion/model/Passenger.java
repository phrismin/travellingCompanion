package com.rudoy.travellingcompanion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "passengers")
@Setter
@Getter
public class Passenger extends User {
    @Column(name = "birth_date")
    private LocalDate birthDate;
}
