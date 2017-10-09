package io.swagger.api.factories;

import io.swagger.api.ProductApiService;
import io.swagger.api.impl.ProductApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-07T04:01:11.568Z")
public class ProductApiServiceFactory {
    private final static ProductApiService service = new ProductApiServiceImpl();

    public static ProductApiService getProductApi() {
        return service;
    }
}
