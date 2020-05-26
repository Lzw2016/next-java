package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * 作者：lizw <br/>
 * 创建时间：2020/05/26 14:10 <br/>
 */
@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        return "Hello World";
    }
}