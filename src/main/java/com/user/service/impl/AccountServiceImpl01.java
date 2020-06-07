package com.user.service.impl;

import com.user.dao.AccountDAO;
import com.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 将这个类交给spring托管
 * <bean id="accountService" class="com.user.service.impl.AccountServiceImpl01" scope=""></bean>
 * @author zzq
 * 注解：
 *      Component
 *          作用：用于把当前类存入spring容器
 *          属性：value就是用于指定bean的id，可以省略，不写的时候默认是类名，首字母小写
 *      Controller：一般用在表现层
 *      Service：一般用于业务层
 *      Repository：一般用于持久层
 *      下面的三个注解和Component是一样的，最好不同的层用不同的注解
 */
@Component("accountService")
//@Scope(value = "")这里可以指定使用单例模式还是多例模式
public class AccountServiceImpl01 implements AccountService {

//   private AccountDAO accountDAO = new AccountDAOImpl01();

    /**
     *  该注解是依赖注入
     *  原理分析：通过bean.xml读取包下所有的class，将对应的class注册（底层放入map，map的key就是注解的value，也就是之前的bean的id，
     *  map的value就是class的全限定类名），Autowired注解会找到对应的实习类，如果只有一个，并且该实现类有Component注解，
     *  则使用代理对象创建，如果有多个实现类，则需要告诉Autowired用id为哪一个的实现类
     */
/*    @Autowired  这里针对的只有一个实现类的时候，默认就是类名，首字母小写
    private AccountDAO accountDAO = null;*/


    /**
     * Resource可以代替Autowired和Qualifier两个注解
     * 针对的存在多个实现类，根据id来具体确定注入哪一个实现类
     * @Resource(name = "AccountDAO02")
     */
    @Autowired
    @Qualifier("AccountDAO02")
    private AccountDAO accountDAO = null;

    public void saveAccount() {
        accountDAO.saveStudent();
    }
}
