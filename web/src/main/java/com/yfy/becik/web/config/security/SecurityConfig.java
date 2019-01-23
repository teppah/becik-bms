package com.yfy.becik.web.config.security;

import com.yfy.becik.web.util.Roles;
import com.yfy.becik.web.util.ViewMappings;
import com.yfy.becik.web.util.ViewNames;
import lombok.extern.java.Log;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configuration class for Spring Security stuff.
 * (authentication, authorizing requests, and such)
 * */
@Log
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/static/**").permitAll()
                .antMatchers("/" + ViewMappings.DASHBOARD + "/**").hasRole(Roles.USER)
                .and()
            .formLogin()
                .loginPage(ViewMappings.LOGIN).failureUrl(ViewMappings.LOGIN_FAIL);
    }
}
