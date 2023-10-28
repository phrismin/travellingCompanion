package com.rudoy.travellingcompanion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "drivers")
@Setter
@Getter
public class Driver extends User {
    @Column(name = "category")
    private String category;
}
