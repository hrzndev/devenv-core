package io.hrzn.devenv.core.user.api;

import io.hrzn.devenv.core.user.api.command.CreateUserCommand;
import io.hrzn.devenv.core.user.api.dtos.CreateUserDto;
import io.hrzn.devenv.core.user.service.UserService;
import io.hrzn.onboard.core.domain.Email;
import io.hrzn.onboard.core.domain.Phone;

import javax.inject.Inject;
import javax.validation.Validator;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/user")
public class UserResource {

    @Inject
    Validator validator;

    @Inject
    UserService service;

    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(CreateUserDto dto) {
        validator.validate(dto);
        final var cmd = CreateUserCommand.builder().fullName(dto.getFullName()).username(dto.getUsername()).email(Email.from(dto.getEmail()))
                .phone(Phone.from(dto.getPhone())).build();
        var obj = service.handle(cmd);
        return Response.ok(obj).build();
    }
}