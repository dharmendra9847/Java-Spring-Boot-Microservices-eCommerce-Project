package com.ecommerce.application.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity(name = "address")
@Table(
        name = "address",
        indexes = {
                @Index(name = "idx_city", columnList = "city"),
                @Index(name = "idx_state", columnList = "state"),
                @Index(name = "idx_country", columnList = "country"),
                @Index(name = "idx_zipcode", columnList = "zipcode")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // =========================
    // STREET
    // =========================
    @NotBlank(message = "Street address is required")
    @Size(min = 5, max = 255,
            message = "Street address must be between 5 and 255 characters")
    @Pattern(
            regexp = "^[A-Za-z0-9,./#()\\-\\s]+$",
            message = "Street address contains invalid characters"
    )
    @Column(name = "street", nullable = false, length = 255)
    private String street;

    // =========================
    // CITY
    // =========================
    @NotBlank(message = "City is required")
    @Size(min = 2, max = 100,
            message = "City name must be between 2 and 100 characters")
    @Pattern(
            regexp = "^[A-Za-z ]+$",
            message = "City name can contain only alphabets and spaces"
    )
    @Column(name = "city", nullable = false, length = 100)
    private String city;

    // =========================
    // STATE
    // =========================
    @NotBlank(message = "State is required")
    @Size(min = 2, max = 100,
            message = "State name must be between 2 and 100 characters")
    @Pattern(
            regexp = "^[A-Za-z ]+$",
            message = "State name can contain only alphabets and spaces"
    )
    @Column(name = "state", nullable = false, length = 100)
    private String state;

    // =========================
    // COUNTRY
    // =========================
    @NotBlank(message = "Country is required")
    @Size(min = 2, max = 100,
            message = "Country name must be between 2 and 100 characters")
    @Pattern(
            regexp = "^[A-Za-z ]+$",
            message = "Country name can contain only alphabets and spaces"
    )
    @Column(name = "country", nullable = false, length = 100)
    private String country;

    // =========================
    // ZIPCODE / PINCODE
    // =========================
    @NotBlank(message = "Zipcode is required")
    @Pattern(
            regexp = "^[1-9][0-9]{5}$",
            message = "Zipcode must be a valid 6-digit Indian PIN code"
    )
    @Column(name = "zipcode", nullable = false, length = 6)
    private String zipcode;
}