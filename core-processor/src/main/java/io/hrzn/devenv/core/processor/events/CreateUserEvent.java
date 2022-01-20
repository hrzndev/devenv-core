package io.hrzn.devenv.core.processor.events;

import io.hrzn.valkyrie.domain.Event;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class CreateUserEvent extends Event {
    private String id;
    private String fullName;
    private String username;
    private String email;
    private String phone;
}
