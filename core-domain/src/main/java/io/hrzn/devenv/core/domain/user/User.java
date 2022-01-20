package io.hrzn.devenv.core.domain.user;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@RegisterForReflection
public class User {
    private UUID id;
    private String fullName;
    private String username;
    private String password;
    private Email email;
    private Phone phone;
}
