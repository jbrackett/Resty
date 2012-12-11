package com.resty.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext container) {
    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    ctx.register(AppConfig.class, WebConfig.class);

    ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher",
        new DispatcherServlet(ctx));

    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping("/");
  }
}
