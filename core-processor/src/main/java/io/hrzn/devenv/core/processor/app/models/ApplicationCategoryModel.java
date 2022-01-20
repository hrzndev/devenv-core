package io.hrzn.devenv.core.processor.app.models;

import io.hrzn.devenv.core.domain.app.ApplicationCategory;
import lombok.Getter;

@Getter
public class ApplicationCategoryModel implements ApplicationCategory {
    private String name;
    private String description;
}
