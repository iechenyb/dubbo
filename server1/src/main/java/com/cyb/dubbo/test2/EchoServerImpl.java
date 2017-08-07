package com.cyb.dubbo.test2;

import com.alibaba.dubbo.config.annotation.Service;
import com.cyb.dubbo.test.EchoService;

/**
 * @author iechenyb
 * 根据版本号指定不同的实现类
 * @since 0.0.0
 */
@Service(version = "1.0.1")
public class EchoServerImpl implements EchoService {
    
    public String echo(String str) {
        System.out.println(str+"1.0.1");
        return str+"1.0.1";
    }
}
