package cn.willon.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 实现业务接口, 重写方法
 */
@Component
public class FeignServiceHystrix implements FeignService {
    @Override
    public String get(@RequestParam(value = "name") String name) {
        return "访问服务器异常...请求参数"+name;
    }
}
