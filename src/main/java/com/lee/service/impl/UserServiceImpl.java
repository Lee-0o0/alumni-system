package com.lee.service.impl;

import com.lee.domain.User;
import com.lee.domain.UserExample;
import com.lee.mapper.AlumniMapper;
import com.lee.mapper.UserMapper;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private AlumniMapper alumniMapper;
    
    @Autowired
    private UserMapper userMapper;

    /**
     * 注册功能
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        int i = userMapper.insert(user);
        return i == 1;
    }

    @Override
    public boolean batchRegister(List<User> users) {
        try{
            for (User user:users){
                userMapper.insert(user);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 登陆功能
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean login(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size()==1){
            boolean equals = users.get(0).getUserPassword().equals(password);
            return equals;
        }
        return false;
    }

    @Override
    public boolean delete(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserUsernameEqualTo(username);
        return userMapper.deleteByExample(userExample) == 1;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 1){
            return users.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean update(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i == 1;
    }
}
