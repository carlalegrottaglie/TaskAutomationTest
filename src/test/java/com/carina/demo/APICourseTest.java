package com.carina.demo;

import com.carina.demo.api.DeleteUserMethod;
import com.carina.demo.api.products.DeleteProduct;
import com.carina.demo.api.products.GetProductCategories;
import com.jayway.jsonpath.JsonPath;
import com.carina.demo.api.products.GetProduct;
import com.carina.demo.api.products.PostProduct;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class APICourseTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Carla")
    public void getProductTest()
    {
        GetProduct getProduct = new GetProduct();
       // getProduct.addUrlParameter("q","Laptop");
        getProduct.setIndex(5);

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

        // Call the API to delete the product and expect success
        deleteProduct.callAPIExpectSuccess();

        // Validate the response after deleting the product
      //  deleteProduct.validateResponse();
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

}