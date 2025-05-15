package com.nympla.webservices.core.useCases;

import com.nympla.webservices.core.entities.Event;

public interface CreateEventCase {
    public Event execute(Event event);
}
