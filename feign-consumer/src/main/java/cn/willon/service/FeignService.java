package cn.willon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Service

//指定  回调处理器
@FeignClient(value = "SERVICE-PROVIDER",fallback = FeignServiceHystrix.class)
public interface FeignService {
    //指定 服务的 接口
    @GetMapping("/get")
    //指定参数 并且绑定
    String get(@RequestParam(value = "name") String name);
}
