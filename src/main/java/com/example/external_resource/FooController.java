package com.example.external_resource;

import org.springframework.boot.web.servlet.error.ErrorController;

public class FooController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

}
