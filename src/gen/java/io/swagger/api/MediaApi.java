package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MediaApiService;
import io.swagger.api.factories.MediaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Media;

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

@Path("/media")


@io.swagger.annotations.Api(description = "the media API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public class MediaApi  {
   private final MediaApiService delegate;

   public MediaApi(@Context ServletConfig servletContext) {
      MediaApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MediaApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MediaApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MediaApiServiceFactory.getMediaApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get media from the system based on the product OR category ID", notes = "get media from the system based on the product OR category ID.", response = Media.class, responseContainer = "List", tags={ "media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Media.class, responseContainer = "List") })
    public Response getMedia(@ApiParam(value = "ID of category for which you want product") @QueryParam("prid") Long prid
,@ApiParam(value = "ID of category for which you want media") @QueryParam("catid") Long catid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMedia(prid,catid,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get media based on the media id", notes = "get media based on the media id", response = Media.class, tags={ "media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Media.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "media not found", response = Media.class) })
    public Response getMediaById(@ApiParam(value = "ID of media to return",required=true) @PathParam("id") Long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMediaById(id,securityContext);
    }
}
