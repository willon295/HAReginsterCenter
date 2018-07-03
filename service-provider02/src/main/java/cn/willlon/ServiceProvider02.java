package cn.willlon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//标注为 eureka 客户端
@EnableEurekaClient
@SpringBootApplication
public class ServiceProvider02 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider02.class, args);
    }
}
