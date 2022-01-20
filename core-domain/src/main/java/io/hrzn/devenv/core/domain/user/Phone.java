package io.hrzn.devenv.core.domain.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.constraints.Pattern;

@Getter
@EqualsAndHashCode
public class Phone {
    @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "")
    private final String number;

    Phone(String number) {
        this.number = number;
    }

    public static Phone from(String number) {
        return new Phone(number);
    }
}
