package com.cloud.feign.web;

import com.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;
    @GetMapping("/hi")
    public String sayHello(@RequestParam String name){

        return feignService.sayHi(name);
    }
}
