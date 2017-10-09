package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CategoryApiService;
import io.swagger.api.factories.CategoryApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Category;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/category")


@io.swagger.annotations.Api(description = "the category API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public class CategoryApi  {
   private final CategoryApiService delegate;

   public CategoryApi(@Context ServletConfig servletContext) {
      CategoryApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CategoryApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CategoryApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CategoryApiServiceFactory.getCategoryApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get categories from the system", notes = "get categories from the system", response = Category.class, responseContainer = "List", tags={ "category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Category.class, responseContainer = "List") })
    public Response getAllCategories(@ApiParam(value = "id of the category") @QueryParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllCategories(id,securityContext);
    }
    @GET
    @Path("/{path}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all sub categories from the system", notes = "get all sub product from the system", response = Category.class, responseContainer = "List", tags={ "category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Category.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Category not found", response = Category.class, responseContainer = "List") })
    public Response getCategories(@ApiParam(value = "All categories inside the path",required=true) @PathParam("path") String path
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCategories(path,securityContext);
    }
}
