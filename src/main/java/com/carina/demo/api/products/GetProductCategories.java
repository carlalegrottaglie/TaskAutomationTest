package com.carina.demo.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/products/categories", methodType = HttpMethodType.GET  )
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductCategories extends AbstractApiMethodV2 {

    public GetProductCategories()
    {replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));

    }

}
