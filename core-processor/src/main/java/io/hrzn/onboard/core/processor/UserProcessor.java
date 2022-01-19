package io.hrzn.onboard.core.processor;

import io.hrzn.onboard.core.processor.events.CreateUserEvent;
import lombok.extern.java.Log;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@Log
@ApplicationScoped
public class UserProcessor {

    @Incoming("core-user")
    public void process(CreateUserEvent user) {
        log.info("Processing user: " + user.getUsername());
    }
}
