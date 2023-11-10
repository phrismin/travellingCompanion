package com.rudoy.travellingcompanion.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@Configuration
public class CustomUrlHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_DRIVER")) {
            response.sendRedirect("/mainPage");
        } else if (roles.contains("ROLE_PASSENGER")) {
            response.sendRedirect("/mainPage");
        } else if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect("/adminPage");
        }
    }
}
