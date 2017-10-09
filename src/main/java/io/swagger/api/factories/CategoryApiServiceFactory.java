package io.swagger.api.factories;

import io.swagger.api.CategoryApiService;
import io.swagger.api.impl.CategoryApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public class CategoryApiServiceFactory {
    private final static CategoryApiService service = new CategoryApiServiceImpl();

    public static CategoryApiService getCategoryApi() {
        return service;
    }
}
