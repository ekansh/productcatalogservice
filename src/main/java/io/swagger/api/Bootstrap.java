package io.swagger.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("Product catalog API which enable CRUD operations on Product and its categories")
      .termsOfService("https://github.com/ekansh")
      .contact(new Contact()
        .email("mail.ekansh@gmail.com"))
      .license(new License()
        .name("GNU")
        .url("https://github.com/ekansh"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
