package com.nympla.webservices.core.entities;

import com.nympla.webservices.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String name,
                    String description,
                    String identification,
                    LocalDateTime start_date,
                    LocalDateTime end_date,
                    String local,
                    EventType type) {}
