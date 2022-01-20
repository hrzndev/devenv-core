package io.hrzn.devenv.core.processor.app.models;

import io.hrzn.devenv.core.domain.app.Application;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;

import java.util.List;

@Getter
@MongoEntity(collection="applications")
public class ApplicationModel extends PanacheMongoEntity implements Application {
    private String name;
    private String description;
    private List<ApplicationCategoryModel> categories;
    private List<ApplicationInstallerModel> installers;
}
