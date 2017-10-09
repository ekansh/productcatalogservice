package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Category;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public abstract class CategoryApiService {
    public abstract Response getAllCategories( String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCategories(String path,SecurityContext securityContext) throws NotFoundException;
}
