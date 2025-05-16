package com.nympla.webservices.core.entities;

import com.nympla.webservices.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String identifier,
                    String title,
                    String description,
                    LocalDateTime start_date,
                    LocalDateTime end_date,
                    String local_event,
                    Integer capacity,
                    EventType type,
                    String image_url) {}
