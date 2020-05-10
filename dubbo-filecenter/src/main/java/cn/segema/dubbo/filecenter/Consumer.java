package cn.segema.dubbo.filecenter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sgema.dubbo.filecenter.api.FilesService;

/**
 * Created by wy on 2017/4/13.
 */
public class Consumer {
    public static void main(String[] args) {

        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
        FilesService demoService = context.getBean(FilesService.class);
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(2L));
    }
}
