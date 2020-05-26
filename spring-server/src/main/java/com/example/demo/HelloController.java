package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：lizw <br/>
 * 创建时间：2020/05/26 14:46 <br/>
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
