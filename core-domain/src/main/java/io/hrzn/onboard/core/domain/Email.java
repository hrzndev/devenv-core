package io.hrzn.onboard.core.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Email {
    @javax.validation.constraints.Email(message = "")
    private final String address;

    Email(String address) {
        this.address = address;
    }

    public static Email from(String address) {
        return new Email(address);
    }
}
