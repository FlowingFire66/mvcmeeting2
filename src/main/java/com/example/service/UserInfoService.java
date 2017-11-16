package com.example.service;

import com.example.domain.UserInfo;

import java.util.List;

public interface UserInfoService {

    public UserInfo findByUsername(String username);

    public void deleteByUsername(Long username);

    void register(UserInfo userInfo);

    UserInfo login(String username, String password);

    List<UserInfo> findAll();

}