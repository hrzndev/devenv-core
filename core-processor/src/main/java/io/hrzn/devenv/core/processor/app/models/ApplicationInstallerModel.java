package io.hrzn.devenv.core.processor.app.models;

import io.hrzn.devenv.core.domain.app.ApplicationInstaller;
import io.hrzn.devenv.core.domain.app.ApplicationVersion;
import lombok.Getter;

@Getter
public class ApplicationInstallerModel implements ApplicationInstaller {
    private ApplicationVersion version;
    private String url;
    private boolean isSilent;
    private boolean isOwnCDN;
}
