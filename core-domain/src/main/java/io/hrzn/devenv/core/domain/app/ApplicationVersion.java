package io.hrzn.devenv.core.domain.app;

public interface ApplicationVersion extends Comparable<ApplicationVersion> {
    String getNumber();
}
