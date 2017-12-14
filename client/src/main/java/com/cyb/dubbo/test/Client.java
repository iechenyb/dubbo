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
        
        //不可以直接通过接口调用
       /* EchoService abc2 = run.getBean(EchoService.class);
        System.out.println(abc2.echo("abccc"));
        System.out.println("=============&&&&&&=============");
        DefService def2 = run.getBean(DefService.class);
        System.out.println(def.service.print("chenyb"));*/
        
        AbcService2 abc1 = run.getBean(AbcService2.class);
        System.out.println(abc1.echoService.echo("abccc"));
        System.out.println("=============&&&&&&=============");
        DefService2 def1 = run.getBean(DefService2.class);
        System.out.println(def1.service.print("chenyb"));
    }
}
