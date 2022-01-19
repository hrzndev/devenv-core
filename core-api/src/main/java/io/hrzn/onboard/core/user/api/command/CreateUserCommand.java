package io.hrzn.onboard.core.user.api.command;

import io.hrzn.onboard.core.domain.Email;
import io.hrzn.onboard.core.domain.Phone;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateUserCommand {
    private String fullName;
    private String username;
    private Email email;
    private Phone phone;
}
