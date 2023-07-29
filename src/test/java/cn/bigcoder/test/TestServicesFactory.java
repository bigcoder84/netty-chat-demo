package cn.bigcoder.test;

import cn.bigcoder.server.service.HelloService;
import cn.bigcoder.server.service.ServicesFactory;

public class TestServicesFactory {
    public static void main(String[] args) {
        HelloService service = ServicesFactory.getService(HelloService.class);
        System.out.println(service.sayHello("hi"));
    }
}
