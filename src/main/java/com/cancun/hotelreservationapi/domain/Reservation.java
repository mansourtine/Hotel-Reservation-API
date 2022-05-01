package com.cancun.hotelreservationapi.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "reservation")
public class Reservation {

    /**
     * Attributes of class
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private int maxStay;

    @NotBlank
    private int maxBooking;

    @NotBlank
    private ZonedDateTime bookingDate;

    @NotBlank
    private ZonedDateTime startDate;

    @NotBlank
    private ZonedDateTime endDate;

}
