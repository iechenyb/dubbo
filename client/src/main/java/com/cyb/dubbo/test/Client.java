package com.cyb.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author iechenyb
 * @since 0.0.0
 */
@SpringBootApplication
public class Client {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Client.class, args);
        AbcService abc = run.getBean(AbcService.class);
        System.out.println(abc.echoService.echo("abccc"));
        System.out.println("==========================");
        DefService def = run.getBean(DefService.class);
        System.out.println(def.service.print("chenyb"));
    }
}
