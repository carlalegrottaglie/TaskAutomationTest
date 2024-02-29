package com.carina.demo.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/products/2", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "api/products/_patch/rq.json")
@ResponseTemplatePath(path = "api/products/_patch/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PatchProduct extends AbstractApiMethodV2 {

    public PatchProduct()
    {replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));

    }
}
