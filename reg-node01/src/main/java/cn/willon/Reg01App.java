package cn.willon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Reg01App {
    public static void main(String[] args) {

        SpringApplication.run(Reg01App.class, args);
    }
}
