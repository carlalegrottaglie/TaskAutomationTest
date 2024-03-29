package com.carina.demo.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;
//import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/products/1", methodType = HttpMethodType.DELETE  )
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@RequestTemplatePath(path = "api/products/_delete/rq.json")
@ResponseTemplatePath(path = "api/products/_delete/rs.json")
public class DeleteProduct extends AbstractApiMethodV2 {
        public DeleteProduct() {
            replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        }
    }
