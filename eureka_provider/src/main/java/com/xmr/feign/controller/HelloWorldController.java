package com.xmr.feign.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World";
    }

    //调用方式为url?id=
    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String hello1(@RequestParam("id") Integer id) {
        return "index==" + id;
    }

    //调用方式为：url/{id}
    @RequestMapping(value = "/hello1/{id}", method = RequestMethod.GET)
    public String hello2(@PathVariable("id") Integer id) {
        return "index==" + id;
    }

}