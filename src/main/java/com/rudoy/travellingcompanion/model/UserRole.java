package com.rudoy.travellingcompanion.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_roles")
@Getter
@Setter
public class UserRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role", unique = true)
    private String role;
    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    private List<User> users = new ArrayList<>();

    @Override
    public String getAuthority() {
        return role;
    }
}
