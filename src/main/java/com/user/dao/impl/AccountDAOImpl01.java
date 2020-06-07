package com.user.dao.impl;

import com.user.dao.AccountDAO;
import org.springframework.stereotype.Component;

/**
 * @author zzq
 */
@Component("accountDAO")
public class AccountDAOImpl01 implements AccountDAO {
    public void saveStudent() {
        System.out.println("Impl01...account信息保存成功");
    }
}
