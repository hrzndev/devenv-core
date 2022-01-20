package io.hrzn.devenv.core.processor.app.models;

import io.hrzn.devenv.core.domain.app.ApplicationVersion;
import lombok.Getter;

@Getter
public class ApplicationVersionModel implements ApplicationVersion {
    private String number;

    @Override
    public int compareTo(ApplicationVersion o) {
        return 0; // TODO: Implement CompareTo in this ApplicationVersion Impl
    }
}
