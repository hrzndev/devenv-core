package io.hrzn.onboard.core.user.service;

import io.hrzn.onboard.core.user.api.command.CreateUserCommand;
import io.hrzn.onboard.core.user.domain.events.CreateUserEvent;
import io.hrzn.valkyrie.domain.Event;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    @Channel("core-user")
    Emitter<Event> emitter;

    public String handle(CreateUserCommand cmd) {
        final var event = CreateUserEvent.builder().id(UUID.randomUUID().toString()).fullName(cmd.getFullName())
                .username(cmd.getUsername()).email(cmd.getEmail().getAddress()).phone(cmd.getPhone().getNumber()).build();
        emitter.send(event);
        return event.getId();
    }
}
