package io.hrzn.devenv.core.domain.app;

import java.util.List;

public interface Application {
    String getName();
    String getDescription();
    List<ApplicationCategory> getCategories();
    List<ApplicationInstaller> getInstallers();
}
