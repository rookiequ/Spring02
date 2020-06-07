package com.user.dao.impl;

import com.user.dao.AccountDAO;
import org.springframework.stereotype.Component;

/**
 * @author zzq
 */
@Component("AccountDAO02")
public class AccountDAOImpl02 implements AccountDAO {
    public void saveStudent() {
        System.out.println("impl02...account信息保存成功");
    }
}
