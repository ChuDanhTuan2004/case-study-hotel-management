package org.example.bookinghotel.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    @OneToOne
    @JoinColumn(name = "id_room")
    private Room room;

}
