package com.wiltech.admin.dashboard.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(final HttpServletRequest request,
            final HttpServletResponse response,
            final AccessDeniedException ex) throws IOException, ServletException {

        final Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null) {
            System.out.println(auth.getName()
                               + " was trying to access protected resource: "
                               + request.getRequestURI());
        }

        response.sendRedirect(request.getContextPath() + "/access-denied");

    }
}
