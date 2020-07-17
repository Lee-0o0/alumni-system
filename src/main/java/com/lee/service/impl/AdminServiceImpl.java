package com.lee.service.impl;

import com.lee.domain.Admin;
import com.lee.domain.AdminExample;
import com.lee.mapper.AdminMapper;
import com.lee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean login(String admin, String password) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminUsernameEqualTo(admin).andAdminPasswordEqualTo(password);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size()!=1){
            return false;
        } else {
            return true;
        }
    }
}
