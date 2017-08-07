package com.cyb.dubbo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyb.dubbo.test.EchoService;

import org.springframework.stereotype.Component;

/**
 * @author iechenyb
 * @since 0.0.0
 */
@Component
public class AbcService {
    @Reference(version = "1.0.0")
    public EchoService echoService;
}
