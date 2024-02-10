package com.carina.demo;

import com.carina.demo.api.DeleteUserMethod;
import com.carina.demo.api.products.*;
import com.jayway.jsonpath.JsonPath;
import com.zebrunner.carina.api.apitools.validation.JsonComparatorContext;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.sql.Date;
import java.util.Objects;

public class APICourseTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Carla")
    public void getProductTest()
    {
        GetProduct getProduct = new GetProduct();
       // getProduct.addUrlParameter("q","Laptop");
        getProduct.setIndex(2);

        Response response = getProduct.callAPIExpectSuccess();
        getProduct.validateResponseAgainstSchema("api/products/_get/rs.schema");
//        System.out.println("**************   " +
//                JsonPath.from(response.asString()).getInt("id")+ "    "+
//                JsonPath.from(response.asString()).getString("description"));

        JsonPath.read(response.asString(),"$.id");


    }

    @Test
    @MethodOwner(owner = "Carla")
    public void getProductsTest()
    {
    GetProduct getProduct;

        Response response;
       for (int i=1; i<= 6; i++) {
           System.out.println("%%%%%%%%%%%   " +i);
           getProduct = new GetProduct();
           getProduct.setIndex(i);


        response = getProduct.callAPIExpectSuccess();
        getProduct.validateResponseAgainstSchema("api/products/_get/rs.schema");
        System.out.println("**************   " +
                io.restassured.path.json.JsonPath.from(response.asString()).getInt("id") + "    " +
                io.restassured.path.json.JsonPath.from(response.asString()).getString("description"));

    }

}


    @Test
    @MethodOwner(owner = "Carla")
    public void getProductCategoriesTest()
    {
        GetProductCategories getProductCategories = new GetProductCategories();
        Response response = getProductCategories.callAPIExpectSuccess();

    }


    @Test
    @MethodOwner(owner = "Carla")
    public void deleteProductTest() throws AssertionError {
        // Create an instance of DeleteProduct
        DeleteProduct deleteProduct = new DeleteProduct();
        deleteProduct.setProperties("api/products/product.properties");
        deleteProduct.callAPIExpectSuccess();

        JsonComparatorContext comparatorContext = JsonComparatorContext.context()
                .<String>withPredicate("isDateValid", Objects::nonNull);
        deleteProduct.validateResponse(comparatorContext);
    }



    @Test
    @MethodOwner(owner = "Carla")
    public void postProductTest()
    {
        PostProduct postProduct = new PostProduct();
        postProduct.setProperties("api/products/product.properties");


        postProduct.callAPIExpectSuccess();
        postProduct.validateResponse();

    }
    @Test
    @MethodOwner(owner = "Carla")
    public void patchProductTest()
    {
        PatchProduct patchProduct = new PatchProduct();
        patchProduct.setProperties("api/products/product.properties");
        patchProduct.callAPIExpectSuccess();
        patchProduct.validateResponseAgainstSchema("api/products/_get/rs.schema");
        patchProduct.validateResponse();

    }
}
