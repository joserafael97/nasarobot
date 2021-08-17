package br.com.jrafael.nasarobot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"br.com.jrafael.nasarobot.api"})
@EntityScan(basePackages = {"br.com.jrafael.nasarobot.api.model"})
@ComponentScan(basePackages = {"br.com.jrafael.infrastructure", "br.com.jrafael.nasarobot.api"})
public class NasaRobotApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NasaRobotApiApplication.class, args);
    }

}
