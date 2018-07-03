package cn.willon.controller;


import cn.willon.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/get")
    public String get(String name) {

        return feignService.get(name);
    }
}
