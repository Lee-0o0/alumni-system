package com.lee.service;

import com.lee.domain.User;

import java.util.List;

public interface UserService {
    public boolean register(User user);
    public boolean batchRegister(List<User> users);
    public boolean login(String username,String password);
    public boolean delete(String username);
    public User selectByUsername(String username);
    public boolean update(User user);
}
