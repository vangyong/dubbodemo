package cn.sgema.dubbo.mall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.segema.dubbo.mall.api.GoodsService;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        GoodsService goodsService = context.getBean(GoodsService.class);

        System.out.println("consumer");
        System.out.println(goodsService.getPermissions(1L));
    }
}
