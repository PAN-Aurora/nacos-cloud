package org.nacos.admin.service;

import org.nacos.admin.api.TestApi;

/**
 * todo..
 *
 * @author :PHQ
 * @date：2021/2/4
 **/
@org.apache.dubbo.config.annotation.Service
public class TestService implements TestApi {
    @Override
    public String testDubbo() {
        return "testggggg";
    }
}
