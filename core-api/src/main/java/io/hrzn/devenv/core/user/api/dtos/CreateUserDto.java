package io.hrzn.devenv.core.user.api.dtos;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class CreateUserDto {
    private String fullName;
    @NotNull(message = "{hrzn.onboard.core.user.CreateUserDto.username.NotBlank}")
    private String username;
    @NotNull
    private String password;
    private String email;
    private String phone;
}
