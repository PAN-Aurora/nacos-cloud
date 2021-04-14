package com.nacos.admin.service;

import com.nacos.admin.api.TestApi;

/**
 * todo..
 *
 * @author :PHQ
 * @date：2021/2/4
 **/
public class TestService implements TestApi {
    @Override
    public String testDubbo() {
        return "testggggg";
    }
}
