package org.example.bookinghotel.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;
}
