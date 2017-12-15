package com.cyb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyb.service.HelloService;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"/applicationContext.xml"});
        context.start();
        HelloService demoService = (HelloService) context.getBean("helloWorldService"); // obtain proxy object for remote invocation
        for ( int i = 0 ; i < 10 ; i ++) {
        	 String hello = demoService.sayHello("world"); // execute remote invocation
             System.out.println(hello); // show the result
        }
       
    }
}