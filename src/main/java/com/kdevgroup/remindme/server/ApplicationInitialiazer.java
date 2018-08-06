package com.kdevgroup.remindme.server;

import com.kdevgroup.remindme.server.config.WebConfig;
import com.kdevgroup.remindme.server.repository.RemindRepository;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitialiazer implements WebApplicationInitializer {

    private static final String DISPATCHER = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(webContext));

        ServletRegistration.Dynamic srv = servletContext.addServlet(DISPATCHER, new DispatcherServlet(webContext));
        srv.addMapping("/");
        srv.setLoadOnStartup(1);

    }
}
