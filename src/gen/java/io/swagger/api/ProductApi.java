package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ProductApiService;
import io.swagger.api.factories.ProductApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Product;

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

@Path("/product")


@io.swagger.annotations.Api(description = "the product API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public class ProductApi  {
   private final ProductApiService delegate;

   public ProductApi(@Context ServletConfig servletContext) {
      ProductApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ProductApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ProductApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ProductApiServiceFactory.getProductApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get products from the system", notes = "get all products in the system if there is no name or category defined. If name is defined then application will search based on the name. If category is defined application will search products based on category name. If both of them are defined then application will narrow down search of products name to specific category. Note that category name must be correct and should be the complete path of category.", response = Product.class, responseContainer = "List", tags={ "product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Product.class, responseContainer = "List") })
    public Response getAllProducts(@ApiParam(value = "ID of product to return") @QueryParam("name") String name
,@ApiParam(value = "ID of product to return") @QueryParam("category") String category
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllProducts(name,category,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get a products from the system", notes = "get a product from the system", response = Product.class, responseContainer = "List", tags={ "product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Product.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Product not found", response = Product.class, responseContainer = "List") })
    public Response getProductById(@ApiParam(value = "ID of product to return",required=true) @PathParam("id") Long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProductById(id,securityContext);
    }
}
