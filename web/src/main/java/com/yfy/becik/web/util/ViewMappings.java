package com.yfy.becik.web.util;

/**
 * Class that holds view mappings for the different endpoints.
 * (for the @Request annotations in the controllers)
 * */
public final class ViewMappings {
    private ViewMappings() {
        throw new UnsupportedOperationException("you can't");
    }

    public static final String HOME = "home";
    public static final String DASHBOARD = "dashboard";
    public static final String LOGIN = "login";
    public static final String LOGIN_FAIL = "login-fail";
}
