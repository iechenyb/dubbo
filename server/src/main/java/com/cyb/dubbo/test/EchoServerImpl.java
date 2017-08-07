package com.cyb.dubbo.test;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author iechenyb
 * @since 0.0.0
 */
@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    public String echo(String str) {
        System.out.println(str+"1.0.0");
        return str;
    }
}
