package com.yfy.becik.web.util;

/**
 * Class that holds view names as constants.
 * Contains all the names of the Thymeleaf templates under
 * resources/templates.
 * */
public final class ViewNames {
    private ViewNames(){
        throw new UnsupportedOperationException("bruh");
    }

    public static final String ROOT = "/";

    public static final String HOME = "home";
    public static final String DASHBOARD = "dashboard";
    public static final String LOGIN_PAGE = "login";
}
