package com.nympla.webservices.infrastructure.persistence;

import com.nympla.webservices.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Events")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifier;
    private String title;
    private String description;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private String local_event;
    private Integer capacity;
    @Enumerated(EnumType.STRING)
    private EventType type;
    private String image_url;

}
