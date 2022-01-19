package io.hrzn.onboard.core.security;

import io.hrzn.valkyrie.jax.security.contexts.RequestContext;
import io.hrzn.valkyrie.jax.security.models.IUser;

import javax.enterprise.context.RequestScoped;
import java.util.Locale;

@RequestScoped
public class DefaultRequestContext implements RequestContext {
    @Override
    public <T extends IUser> T getAuthenticatedUser() {
        return null;
    }

    @Override
    public String getRequestIpAddress() {
        return null;
    }

    @Override
    public <T extends Locale> T getRequestLocale() {
        return null;
    }
}
