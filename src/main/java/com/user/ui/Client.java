package com.user.ui;

import com.user.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzq
 * spring的控制反转，依赖注入 IOC
 */
public class Client {
    public static void main(String[] args) {
        //获取spring核心配置文件

        //方式二：它可以加载磁盘任意路径下的文件（必须要有访问权限）
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext();
        //方式三：用于读取注解创建容器
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //根据id获取bean对象,这里我们可以了解到使用的是单例模式
/*        for(int i =0; i < 5; i++){
            AccountService accountService = (AccountService) applicationContext.getBean("accountService");
            accountService.saveAccount();
        }*/

        //方式一：它可以加载类路径下的配置文件：要求配置文件必须在类路径下，不在的话加载不了（最常见的方式）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.saveAccount();

    }
}
