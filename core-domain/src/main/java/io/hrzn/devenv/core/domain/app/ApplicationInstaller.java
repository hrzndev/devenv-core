package io.hrzn.devenv.core.domain.app;

public interface ApplicationInstaller {
    ApplicationVersion getVersion();
    String getUrl();
    boolean isSilent();
    boolean isOwnCDN();
}
