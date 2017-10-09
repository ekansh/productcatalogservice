package io.swagger.api.factories;

import io.swagger.api.MediaApiService;
import io.swagger.api.impl.MediaApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public class MediaApiServiceFactory {
    private final static MediaApiService service = new MediaApiServiceImpl();

    public static MediaApiService getMediaApi() {
        return service;
    }
}
